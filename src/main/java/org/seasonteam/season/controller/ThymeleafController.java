package org.seasonteam.season.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author yust
 *         2016-11-25
 */
@Controller
@RequestMapping("/thymeleaf")
public class ThymeleafController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request) {
        request.setAttribute("a", "are you ok?");
        return "1";
    }
}
