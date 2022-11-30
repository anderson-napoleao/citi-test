package com.citi.bankuserservice.model.dto;

import com.citi.bankuserservice.util.enums.Status;

public class UserStatusUpdateRequest {
    private Status status;

    public UserStatusUpdateRequest(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
