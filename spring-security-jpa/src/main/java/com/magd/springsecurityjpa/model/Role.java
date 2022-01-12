package com.magd.springsecurityjpa.model;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Role {

    @Id
    @GeneratedValue
    private int role_id;
    private String role;
}
