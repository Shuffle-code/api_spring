package ru.open.api_spring.dto.common;

//import lombok.*;

import ru.open.api_spring.entity.common.enums.Presence;
import ru.open.api_spring.entity.common.enums.TypeTechnics;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class TechnicDto {
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String manufactureCountry;
    @NotBlank
    private String manufacture;
    @NotNull
    private Presence orderOn;
    @NotNull
    private Presence credit;
    @NotNull
    private TypeTechnics typeTechnics;

    public Presence getOrderOn() {
        return orderOn;
    }

    public void setOrderOn(Presence orderOn) {
        this.orderOn = orderOn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getManufactureCountry() {
        return manufactureCountry;
    }

    public void setManufactureCountry(String manufactureCountry) {
        this.manufactureCountry = manufactureCountry;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }


    public Presence getCredit() {
        return credit;
    }

    public void setCredit(Presence credit) {
        this.credit = credit;
    }

    public TypeTechnics getTypeTechnics() {
        return typeTechnics;
    }

    public void setTypeTechnics(TypeTechnics typeTechnics) {
        this.typeTechnics = typeTechnics;
    }
}
