package com.coderscampus.JobTrackingApp.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/home")
    public String getSuccessMessage () {
        return "home/home";
    }

//    @GetMapping("/home/{userId}")
//    public String getHome(ModelMap model, @PathVariable Long userId) {
//        User savedUser = userService.findById(userId);
//        List<Application> applications = savedUser.getApplications();
//        if (savedUser == null) {
//            return "redirect:/register";
//        }
//        model.put("applications", applications);
//        model.put("user", savedUser);
//        return "home";
//
//    }
//        @GetMapping("/createApplication/{userId}")
//        public String createApplication(ModelMap model) {
//            model.put("application", new Application());
//            return "create-application";
//        }
//
//        @PostMapping("/createApplication/{userId}")
//        public String createApplication(@PathVariable Long userId, Application application) {
////        System.out.println(application.getAppDate());
//            applicationService.save(application, userId);
//
//            return "redirect:/home/" + userId;
//        }
}
