package com.project.ding_dong.dtos;

public record CreateReceiverUserDTO(
        String name,
        String email,
        String documentNumber,
        String phoneNumber,
        String street,
        String streetNumber,
        String zipCode,
        String city
) {
}
