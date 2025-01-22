package com.project.ding_dong.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class FriendsReceiverUser extends BaseEntity {

    private String name;

    private String phoneNumber;

    private String street;

    private String streetNumber;

    private String zipCode;

    private String city;

    @ManyToOne
    @JoinColumn(name = "receiverUserId")
    private ReceiverUser receiverUser;


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

    public ReceiverUser getReceiverUser() {
        return this.receiverUser;
    }

    public void setReceiverUser(ReceiverUser receiverUser) {
        this.receiverUser = receiverUser;
    }
}
