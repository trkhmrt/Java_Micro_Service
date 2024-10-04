package com.tarikhmrt.model;

import jakarta.persistence.*;

@Entity
@Table(name="auth")
public class Auth extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String username;
    private String email;
    private String password;


}
