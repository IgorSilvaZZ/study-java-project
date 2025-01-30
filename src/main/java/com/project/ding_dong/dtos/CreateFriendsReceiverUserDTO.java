package com.project.ding_dong.dtos;

public record CreateFriendsReceiverUserDTO(
        String name,
        String phoneNumber,
        String street,
        String streetNumber,
        String zipCode,
        String city
) {
}
