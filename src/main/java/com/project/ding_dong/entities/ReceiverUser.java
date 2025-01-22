package com.project.ding_dong.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class ReceiverUser extends BaseEntity {

    private String name;

    private String email;

    private String documentNumber;

    private String phoneNumber;

    private String street;

    private String streetNumber;

    private String zipCode;

    private String city;

    @OneToMany(mappedBy = "receiverUser", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<FriendsReceiverUser> friendsReceiverUsers;

    @OneToMany(mappedBy = "receiverUserNotifications", cascade = CascadeType.ALL)
    private List<NotificationReceiverUser> notificationReceiverUsers;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return this.streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public List<FriendsReceiverUser> getFriendsReceiverUsers() {
        return this.friendsReceiverUsers;
    }

    public void setFriendsReceiverUsers(List<FriendsReceiverUser> friendsReceiverUsers) {
        this.friendsReceiverUsers = friendsReceiverUsers;
    }

    public List<NotificationReceiverUser> getNotificationReceiverUsers() {
        return this.notificationReceiverUsers;
    }

    public void setNotificationReceiverUsers(List<NotificationReceiverUser> notificationReceiverUsers) {
        this.notificationReceiverUsers = notificationReceiverUsers;
    }
}
