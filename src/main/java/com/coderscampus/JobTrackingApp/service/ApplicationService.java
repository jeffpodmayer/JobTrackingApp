package com.coderscampus.JobTrackingApp.service;

import com.coderscampus.JobTrackingApp.domain.Application;
import com.coderscampus.JobTrackingApp.domain.User;
import com.coderscampus.JobTrackingApp.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepo;
    private final UserServiceImpl userService;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepo, UserServiceImpl userService) {
        this.applicationRepo = applicationRepo;
        this.userService = userService;
    }

    public Application saveCreateApplication(Application application, Integer userId) {
        User user = userService.findUserById(userId).orElse(null);
        application.setUser(user);
        user.getApplications().add(application);
        return applicationRepo.save(application);
    }

    public Application save(Application application){
        return applicationRepo.save(application);
    }
    public Application findById(Long appId) {
        return applicationRepo.findById(appId).orElse(null);
    }

    public void updateAppInfo(Application app, Application application) {
//        application.setCompany(app.getCompany());
//        application.getAppDate()
    }
}
