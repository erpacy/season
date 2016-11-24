package org.seasonteam.season.controller;

import org.seasonteam.season.model.User;
import org.seasonteam.season.model.dto.ResultHeader;
import org.seasonteam.season.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultHeader register(User user) {
        return userService.add(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultHeader login(@RequestParam("username") String username,
                              @RequestParam("password") String password) {
        return userService.login(username, password);
    }
}
