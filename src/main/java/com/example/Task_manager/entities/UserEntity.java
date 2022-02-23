package com.example.Task_manager.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table (name = "user")

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String deportment;
    private Role role;
    private boolean status;

    public UserEntity(String userName, String password, String firstName, String lastName, String deportment) {
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.deportment = deportment;
    }
}
