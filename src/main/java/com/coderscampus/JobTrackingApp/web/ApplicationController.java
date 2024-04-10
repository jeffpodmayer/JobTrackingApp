package com.coderscampus.JobTrackingApp.web;

import com.coderscampus.JobTrackingApp.domain.Application;
import com.coderscampus.JobTrackingApp.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/applications")
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
        applicationService.saveCreateApplication(application, userId);
        return "redirect:/home/" + userId;
    }

    @GetMapping("/{appId}")
    public String getAppInfo(ModelMap model, @PathVariable Long appId) {
        Application application = applicationService.findById(appId);
        model.addAttribute("app", application);
        return "application/create-application";
    }

    @PostMapping("/{appId}")
    public String postUpdateApp(@ModelAttribute("application") Application currentApp, @PathVariable Long appId) {
        Application application = applicationService.findById(app.getAppId());
//        applicationService.updateAppInfo(app, application);
        applicationService.save(application);
        return "redirect:/home/" +  application.getUser().getId();
    }
}
