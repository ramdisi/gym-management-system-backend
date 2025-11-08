package com.ramdisi.erp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@Getter
@Setter
@ToString
public class TrainerEntity {
    @Id
    private String id;
    private String name;
    private String address;
    private Double salary;
    private String phoneNo;
    private String email;
    private LocalDate dob;
    private int experienceOfYears;
}
