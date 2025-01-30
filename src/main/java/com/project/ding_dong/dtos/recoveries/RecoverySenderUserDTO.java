package com.project.ding_dong.dtos.recoveries;

import java.util.Optional;

public record RecoverySenderUserDTO(
        String id,
        String name,
        String documentNumber,
        Optional<String> phoneNumber
) {
}
