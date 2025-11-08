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
@Setter
@Getter
@ToString
public class PaymentEntity {
    @Id
    private String id;
    private double amount;
    private LocalDate payDate;
}
