package com.ramdisi.erp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Trainer {
    private String id;
    private String name;
    private String address;
    private Double salary;
    private String phoneNo;
    private String email;
    private LocalDate dob;
    private int experienceOfYears;

}
