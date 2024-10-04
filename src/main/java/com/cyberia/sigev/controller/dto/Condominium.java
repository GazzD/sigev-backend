package com.cyberia.sigev.controller.dto;

import com.cyberia.sigev.model.CondominiumEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Condominium  {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String country;

    public Condominium(CondominiumEntity entity) {
        this.name = entity.getName();
        this.address = entity.getAddress();
        this.city = entity.getCity();
        this.state = entity.getState();
        this.zipCode = entity.getZipCode();
        this.country = entity.getCountry();
    }

    public CondominiumEntity toEntity() {
        CondominiumEntity entity = new CondominiumEntity();
        entity.setName(this.name);
        entity.setAddress(this.address);
        entity.setCity(this.city);
        entity.setState(this.state);
        entity.setZipCode(this.zipCode);
        entity.setCountry(this.country);
        return entity;
    }
}
