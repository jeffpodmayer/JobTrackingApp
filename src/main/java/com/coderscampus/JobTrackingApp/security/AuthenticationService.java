package com.coderscampus.JobTrackingApp.security;

import com.coderscampus.JobTrackingApp.dao.request.SignInRequest;
import com.coderscampus.JobTrackingApp.dao.request.SignUpRequest;
import com.coderscampus.JobTrackingApp.dao.response.JwtAuthenticationResponse;

public interface AuthenticationService {
    JwtAuthenticationResponse signup(SignUpRequest request);
    JwtAuthenticationResponse signin(SignInRequest request);
}