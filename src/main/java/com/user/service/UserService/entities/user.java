package com.user.service.UserService.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "micro_users")
public class user {
    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name="NAME")
    private String name;
    @Column(name="EMAIl")
    private String email;
    @Column(name="ABOUT")
    private String about;
}
