package com.coderscampus.JobTrackingApp.repository;

import com.coderscampus.JobTrackingApp.domain.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long>{


}
