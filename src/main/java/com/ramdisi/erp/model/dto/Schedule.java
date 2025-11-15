package com.ramdisi.erp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
@ToString
@Setter
@Getter
@AllArgsConstructor
public class Schedule {
    private String id;
    private LocalDate startDate;
    private LocalDate endDate;
    private String description;
}
