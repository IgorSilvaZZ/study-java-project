package com.project.ding_dong.dtos.recoveries;

import com.project.ding_dong.entities.FriendsReceiverUser;
import com.project.ding_dong.entities.NotificationReceiverUser;

import java.util.List;

public record RecoveryReceiverUserDTO(
        String id,
        String name,
        String email,
        String documentNumber,
        String phoneNumber,
        String street,
        String streetNumber,
        String zipCode,
        String city,
        List<FriendsReceiverUser> friendsReceiverUsers,
        List<NotificationReceiverUser> notificationReceiverUsers
) {}
