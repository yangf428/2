package com.xiaozl.initialwork1.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xiaozl.initialwork1.entity.User;
import com.xiaozl.initialwork1.service.UserService;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xiaozl
 * @date 2017/11/20
 */
@Controller
@RequestMapping(value = "")
public class IndexController {

    @Resource
    private UserService userService;


    @RequestMapping(value = {"", "/", "login"}, method = RequestMethod.GET)
    public String toLogin(HttpServletRequest request) {
        //If session have attribute "user", jump to index page, else jump to login page.
        if (request.getSession().getAttribute("user") != null) {
            return "index";
        } else {
            return "login";
        }
    }

    //Login
    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(User user, Model model, HttpServletRequest request) throws Exception {
        try {
            //If pass, set attribute to session, then redirect to index page.
            if (userService.checkLogin(user)) {
                request.getSession().setAttribute("user", user);
                return "index";
            }
            //If not pass, send error attribute.
            else {
                model.addAttribute("login_err", "登录失败!");
                return "login";
            }
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "login";
        }
    }

    //Register
    @RequestMapping(value = "doregister", method = RequestMethod.POST)
    public String register(User user, Model model) throws Exception {
        try {

            userService.newUser(user);
            model.addAttribute("username", user.getUserName());
            return "index";
        } catch (Exception e) {
            return "";
        }

    }


    @RequestMapping(value = "toRegister", method = RequestMethod.GET)
    public String toRegister() throws Exception {

        return "register";

    }


    @RequestMapping(value = "List", method = RequestMethod.GET)
    public String List(User user, Model model, HttpServletRequest request) throws Exception {
       /* if (request.getSession().getAttribute("user") != null){
            return "index";
        }
        else {
            return "login";*/
        try {
            if (request.getSession().getAttribute("id") != null) {
                return " ";
            }
            els:
            {
                return "List";
            }
        } catch (Exception e) {
            return "";
        }


    }
}