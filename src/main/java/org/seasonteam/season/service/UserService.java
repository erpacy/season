package org.seasonteam.season.service;

import org.seasonteam.season.model.User;
import org.seasonteam.season.model.dto.ResultHeader;
import org.seasonteam.season.model.dto.UploadResult;

/**
 * 用户服务
 *
 * @author yust
 *         2016-11-24
 */
public interface UserService {

    /**
     * 添加用户
     *
     * @param user
     */
    ResultHeader add(User user);

    /**
     * 登陆
     *
     * @param username
     * @param password
     * @return
     */
    ResultHeader login(String username, String password);

}
