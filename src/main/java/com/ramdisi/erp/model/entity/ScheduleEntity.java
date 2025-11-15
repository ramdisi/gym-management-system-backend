package com.ramdisi.erp.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@Entity
@ToString
@Setter
@Getter
@AllArgsConstructor
public class ScheduleEntity {
    private String id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
    @ManyToOne
    private TrainerEntity trainer;
}
