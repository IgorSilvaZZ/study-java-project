package com.project.ding_dong.entities;

import jakarta.persistence.Entity;

@Entity
public class NotificationReceiverUser extends BaseEntity {
    private String description;

    private Boolean status;

    private ReceiverUser receiverUserNotifications;

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public ReceiverUser getReceiverUserNotifications() {
        return this.receiverUserNotifications;
    }

    public void setReceiverUserNotifications(ReceiverUser receiverUserNotifications) {
        this.receiverUserNotifications = receiverUserNotifications;
    }
}
