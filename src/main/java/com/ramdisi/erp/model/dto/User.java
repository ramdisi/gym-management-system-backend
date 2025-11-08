package com.ramdisi.erp.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Setter
@Getter
public class User {
    private String id;
    private String userName;
    private String password;
    private String role;
}
