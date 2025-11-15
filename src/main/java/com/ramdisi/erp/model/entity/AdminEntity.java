package com.ramdisi.erp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AdminEntity {
    @Id
    private String id;
    private String name;
    private String email;
    @OneToOne
    private UserEntity user;
}
