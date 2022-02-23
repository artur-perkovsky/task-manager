package com.example.Task_manager.repositories;

import com.example.Task_manager.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByUserName(String userName);
}
