package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.userService;

import javax.annotation.Resource;

/**
 * Created by ’≈∫Ω on 2016/5/10.
 */
@Controller
@RequestMapping("/user")
public class userController {
    @Resource
    private userService userService;
    @RequestMapping("/login")
    public String login(User user){
        if(userService.login(user)==null){
            return "wrong";
        }
        else{
            return "ok";
        }
    }
}
