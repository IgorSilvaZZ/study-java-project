package com.project.ding_dong.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ding_dong.entities.NotificationReceiverUser;

public interface NotificationReceiverUserRepository extends JpaRepository<NotificationReceiverUser, String> {}
