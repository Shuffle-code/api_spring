package ru.open.api_spring.dto;

//import lombok.*;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import ru.open.api_spring.entity.common.enums.Presence;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;

public class ModelDto {
    private Long id;
    @NotBlank
    private String name;
    @NotBlank
    private String serialNumber;
//    @NotBlank
    private String color;
    @NotBlank
    private String size;
    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer = 6, fraction = 2)
    private BigDecimal cost;
    @NotNull
    private String technology;

    @NotNull
    private Presence presence;
    @NotNull
    private int technic_id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public Presence getPresence() {
        return presence;
    }

    public void setPresence(Presence presence) {
        this.presence = presence;
    }

    public int getTechnic_id() {
        return technic_id;
    }

    public void setTechnic_id(int technic_id) {
        this.technic_id = technic_id;
    }
}
