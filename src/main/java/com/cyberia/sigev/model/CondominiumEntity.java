package com.cyberia.sigev.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "condominium")
public class CondominiumEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

}
