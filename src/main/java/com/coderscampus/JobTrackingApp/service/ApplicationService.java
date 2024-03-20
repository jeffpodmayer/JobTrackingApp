package com.coderscampus.JobTrackingApp.service;

import com.coderscampus.JobTrackingApp.domain.Application;
import com.coderscampus.JobTrackingApp.domain.User;
import com.coderscampus.JobTrackingApp.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApplicationService {
    private final ApplicationRepository applicationRepo;
    private final UserService userService;

    @Autowired
    public ApplicationService(ApplicationRepository applicationRepo, UserService userService) {
        this.applicationRepo = applicationRepo;
        this.userService = userService;
    }

    public Application save(Application application, Long userId) {
        User user = userService.findById(userId);
        application.setUser(user);
        user.getApplications().add(application);
        return applicationRepo.save(application);
    }
}
