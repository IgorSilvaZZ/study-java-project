package com.project.ding_dong.mappers;

import com.project.ding_dong.dtos.CreateSenderUserDTO;
import com.project.ding_dong.entities.SenderUser;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SenderUserMapper {
    SenderUser mapCreateSenderUserDTO(CreateSenderUserDTO createSenderUserDTO);
}
