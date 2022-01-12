package com.magd.springsecurityjpa.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class User {

    @Id
    private int user_id;
    private String username;
    private String password;
    private String email;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "user_id"),inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;
}
