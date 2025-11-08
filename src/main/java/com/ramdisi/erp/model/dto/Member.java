package com.ramdisi.erp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Member {
    private String id;
    private String name;
    private String email;
    private String address;
    private LocalDate date;
    private double bmi;
    private String phoneNumber;
    private Double registrationFee;
    private double subscription;
}
