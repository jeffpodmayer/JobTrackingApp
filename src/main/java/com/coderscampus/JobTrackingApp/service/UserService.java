package com.coderscampus.JobTrackingApp.service;

import com.coderscampus.JobTrackingApp.domain.User;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService {
    UserDetailsService userDetailsService();
    List<User> findAll();

    User findById(Long userId);
}