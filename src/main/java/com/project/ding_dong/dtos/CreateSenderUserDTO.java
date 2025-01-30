package com.project.ding_dong.dtos;

import java.util.Optional;

public record CreateSenderUserDTO(
    String name,
    String documentNumber,
    Optional<String> phoneNumber
) {
}
