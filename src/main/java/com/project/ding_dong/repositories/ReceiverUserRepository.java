package com.project.ding_dong.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ding_dong.entities.ReceiverUser;

public interface ReceiverUserRepository extends JpaRepository<ReceiverUser, String> {}
