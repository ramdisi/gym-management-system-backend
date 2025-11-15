package com.ramdisi.erp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Entity
@AllArgsConstructor
@Setter
@Getter
@ToString
public class MemberEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String address;
    private LocalDate date;
    private double bmi;
    private String phoneNumber;
    private Double registrationFee;
    private double subscription;
    @OneToOne
    private UserEntity user;
    @OneToOne
    private ScheduleEntity preferedSchedule;
    @ManyToOne
    private TrainerEntity preferedTrainer;
}
