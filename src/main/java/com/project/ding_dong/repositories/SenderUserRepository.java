package com.project.ding_dong.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.ding_dong.entities.SenderUser;

public interface SenderUserRepository extends JpaRepository<SenderUser, String> {}
