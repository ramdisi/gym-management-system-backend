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
public class Payment {
    private String id;
    private double amount;
    private LocalDate payDate;

}
