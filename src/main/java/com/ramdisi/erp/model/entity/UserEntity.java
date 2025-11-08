package com.ramdisi.erp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@AllArgsConstructor
@Setter
@Getter
public class UserEntity {
    @Id
    private String id;
    private String userName;
    private String password;
    private String role;
}
