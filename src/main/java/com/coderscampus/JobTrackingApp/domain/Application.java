package com.coderscampus.JobTrackingApp.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;

@Entity
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appId;
    private LocalDate appDate;
    private Date followUpDate;
    private Boolean followUp;
    private Integer numberOfFollowUps;
    private String company;
    private String jobTitle;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private enum status{
        APPLIED,
        FOLLOWED_UP,
        INTERVIEW,
        REJECTED,
        JOB_OFFER
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public LocalDate getAppDate() {
        return appDate;
    }

    public void setAppDate(LocalDate appDate) {
        this.appDate = appDate;
    }

    public Date getFollowUpDate() {
        return followUpDate;
    }

    public void setFollowUpDate(Date followUpDate) {
        this.followUpDate = followUpDate;
    }

    public Boolean getFollowUp() {
        return followUp;
    }

    public void setFollowUp(Boolean followUp) {
        this.followUp = followUp;
    }

    public Integer getNumberOfFollowUps() {
        return numberOfFollowUps;
    }

    public void setNumberOfFollowUps(Integer numberOfFollowUps) {
        this.numberOfFollowUps = numberOfFollowUps;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Application{" +
                "appId=" + appId +
                ", appDate=" + appDate +
                ", followUpDate=" + followUpDate +
                ", followUp=" + followUp +
                ", numberOfFollowUps=" + numberOfFollowUps +
                ", company='" + company + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", user=" + user +
                '}';
    }
    
}
