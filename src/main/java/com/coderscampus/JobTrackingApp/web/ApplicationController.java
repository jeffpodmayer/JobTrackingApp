package com.coderscampus.JobTrackingApp.web;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.coderscampus.JobTrackingApp.domain.Application;
import com.coderscampus.JobTrackingApp.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import com.coderscampus.JobTrackingApp.domain.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationController {

    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    @GetMapping("/createApplication/{userId}")
    public String getCreateApplication(ModelMap model) {
        model.addAttribute("app", new Application());
        return "application/create-application";
    }

    @PostMapping("/createApplication/{userId}")
    public String postCreateApplication(@PathVariable Integer userId, Application application) {
//        System.out.println(application.getAppDate());
        applicationService.save(application, userId);
        return "redirect:/home/" + userId;
    }
}
