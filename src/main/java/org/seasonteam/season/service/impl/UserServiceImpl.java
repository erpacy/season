package org.seasonteam.season.service.impl;

import org.apache.commons.lang3.StringUtils;
import org.seasonteam.season.mapper.UserMapper;
import org.seasonteam.season.model.User;
import org.seasonteam.season.model.UserExample;
import org.seasonteam.season.model.dto.ResultHeader;
import org.seasonteam.season.service.UserService;
import org.seasonteam.season.util.BaseUtil;
import org.seasonteam.season.util.SmsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 用户服务
 *
 * @author yust
 *         2016-11-24
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultHeader add(User user) {
        ResultHeader result = validateAdd(user);
        if (result != null) {
            return result;
        }
        try {
            result = new ResultHeader();
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andPhoneEqualTo(user.getPhone()).andPasswordIsNull();
            List<User> users = userMapper.selectByExample(example);
            if (users == null || users.size() == 0) {
                result.setCode(0);
                result.setMsg("该用户还未发送验证码，添加用户异常");
                return result;
            }
            User selectUser = users.get(0);
            if (!selectUser.getToken().equals(user.getToken())) {
                result.setCode(0);
                result.setMsg("验证码错误，添加用户异常");
                return result;
            }
            user.setUid(selectUser.getUid());
            if (StringUtils.isNotBlank(user.getPassword())) {
                user.setPassword(BaseUtil.md5(user.getPassword()));
            }
            userMapper.insertSelective(user);
            result.setCode(1);
            result.setMsg("添加用户成功");
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("添加用户异常");
        }
        return result;
    }

    @Override
    public ResultHeader login(String username, String password) {
        ResultHeader result = new ResultHeader();
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        UserExample.Criteria criteria1 = example.createCriteria();
        criteria1.andPhoneEqualTo(username);
        List<User> users = userMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(users)) {
            result.setCode(0);
            result.setMsg("未找到该用户");
            return result;
        }
        User user = users.get(0);
        if (BaseUtil.md5(password).equals(user.getPassword())) {
            result.setCode(1);
            result.setMsg("登录成功");
            return result;
        } else {
            result.setCode(0);
            result.setMsg("密码错误，登录失败");
            return result;
        }
    }

    @Override
    public ResultHeader sendCode(String phone) {
        ResultHeader result = new ResultHeader();
        if (StringUtils.isBlank(phone)) {
            result.setCode(0);
            result.setMsg("手机号为空,发送验证码失败");
            return result;
        }
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone).andPasswordIsNotNull();
        int count = userMapper.countByExample(example);
        if (count > 0) {
            result.setCode(0);
            result.setMsg("该手机号已注册,发送验证码失败");
            return result;
        }
        String randNum = BaseUtil.getRandNum(4);//验证码
        boolean sendRes = SmsUtil.sendCode(phone, randNum);
        if (!sendRes) {
            result.setCode(0);
            result.setMsg("发送验证码失败,请重试");
            return result;
        }
        User user = new User();
        user.setPhone(phone);
        user.setToken(randNum);
        user.setUid(BaseUtil.genUUID());
        userMapper.insertSelective(user);
        result.setCode(1);
        result.setMsg("发送验证码成功");
        return result;
    }

    /**
     * 教研添加用户数据
     *
     * @param user
     * @return
     */
    private ResultHeader validateAdd(User user) {
        ResultHeader result = new ResultHeader();
        if (StringUtils.isNotBlank(user.getUsername())) {
            UserExample example = new UserExample();
            UserExample.Criteria criteria = example.createCriteria();
            criteria.andUsernameEqualTo(user.getUsername());
            List<User> users = userMapper.selectByExample(example);
            if (!CollectionUtils.isEmpty(users)) {
                result.setCode(0);
                result.setMsg("用户名重复,添加用户异常");
                return result;
            }
        }
        if (StringUtils.isBlank(user.getPassword())) {
            result.setCode(0);
            result.setMsg("密码为空,添加用户异常");
            return result;
        }
        if (StringUtils.isBlank(user.getPhone())) {
            result.setCode(0);
            result.setMsg("手机号为空,添加用户异常");
            return result;
        }
        if (StringUtils.isBlank(user.getToken())) {
            result.setCode(0);
            result.setMsg("验证码为空,添加用户异常");
            return result;
        }
        return null;
    }
}
