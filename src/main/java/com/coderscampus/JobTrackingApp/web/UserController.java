package com.coderscampus.JobTrackingApp.web;

import com.coderscampus.JobTrackingApp.domain.Application;
import com.coderscampus.JobTrackingApp.domain.User;
import com.coderscampus.JobTrackingApp.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/home")
public class UserController {

    private final UserServiceImpl userService;

    @Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/{userId}")
    public String getHome(ModelMap model, @PathVariable Integer userId) {
        User savedUser = userService.findUserById(userId).orElse(null);
        if (savedUser == null) {
            return "redirect:/register";
        }
        List<Application> applications = savedUser.getApplications();
        model.put("apps", applications);
        model.put("user", savedUser);
        return "home/home";

    }
}
