package org.seasonteam.season.controller;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.seasonteam.season.model.User;
import org.seasonteam.season.model.dto.ResultHeader;
import org.seasonteam.season.model.dto.UploadResult;
import org.seasonteam.season.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.FileOutputStream;

/**
 * 用户
 *
 * @author yust
 *         2016-11-24
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/sendCode", method = RequestMethod.POST)
    public ResultHeader sendCode(@RequestParam("phone") String phone) {
        return userService.sendCode(phone);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultHeader register(User user) {
        return userService.add(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultHeader login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        return userService.login(username, password);
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public UploadResult upload(@RequestParam("file") MultipartFile file, HttpServletRequest request) {
        UploadResult result = new UploadResult();
        if (file == null) return null;
        String fileName = file.getOriginalFilename();
        String path = request.getServletContext().getRealPath("/upload");
        //获取指定文件或文件夹在工程中真实路径，getRequest()这个方法是返回一个HttpServletRequest，封装这个方法为了处理编码问题
        try {
            FileOutputStream fos = new FileOutputStream(path + "/" + fileName);
            IOUtils.copy(file.getInputStream(), fos);//将MultipartFile file转成二进制流并输入到FileOutStrean
            fos.close();//养成良好习惯
            result.setMsg("上传图片成功");
            result.setFileUrl(request.getContextPath() + "/upload/" + fileName);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("上传图片失败");
        }
        return result;
    }
}
