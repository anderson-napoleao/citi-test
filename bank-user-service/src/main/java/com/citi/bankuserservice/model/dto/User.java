package com.citi.bankuserservice.model.dto;

import com.citi.bankuserservice.util.enums.Status;

public class User {
    private Long id;

    private String email;

    private String identification;

    private String password;

    private String authId;

    private Status status;

    public User() {
    }

    public User(Long id, String email, String identification, String password, String authId, Status status) {
        this.id = id;
        this.email = email;
        this.identification = identification;
        this.password = password;
        this.authId = authId;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthId() {
        return authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", identification='" + identification + '\'' +
                ", password='" + password + '\'' +
                ", authId='" + authId + '\'' +
                ", status=" + status +
                '}';
    }
}