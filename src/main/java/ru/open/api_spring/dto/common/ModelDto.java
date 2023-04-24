package ru.open.api_spring.dto.common;

import ru.open.api_spring.entity.Technic;
import ru.open.api_spring.entity.common.enums.Presence;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
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
    private Presence presence;
    @NotNull
    private Integer technic_id;
    private String technology;

    private String category;

    private String countDoors;

    private String typeCompressor;

    private String typeProcessor;

    private String remember;

    private String countCameras;

    private String countDustCollector;

    private String countModes;

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

    public Presence getPresence() {
        return presence;
    }

    public void setPresence(Presence presence) {
        this.presence = presence;
    }

//    public Technic getTechnic() {
//        return technic;
//    }
//
//    public void setTechnic(Technic technic) {
//        this.technic = technic;
//    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(String countDoors) {
        this.countDoors = countDoors;
    }

    public String getTypeCompressor() {
        return typeCompressor;
    }

    public void setTypeCompressor(String typeCompressor) {
        this.typeCompressor = typeCompressor;
    }

    public String getTypeProcessor() {
        return typeProcessor;
    }

    public void setTypeProcessor(String typeProcessor) {
        this.typeProcessor = typeProcessor;
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    public String getCountCameras() {
        return countCameras;
    }

    public void setCountCameras(String countCameras) {
        this.countCameras = countCameras;
    }

    public String getCountDustCollector() {
        return countDustCollector;
    }

    public void setCountDustCollector(String countDustCollector) {
        this.countDustCollector = countDustCollector;
    }

    public String getCountModes() {
        return countModes;
    }

    public void setCountModes(String countModes) {
        this.countModes = countModes;
    }

    public Integer getTechnic_id() {
        return technic_id;
    }

    public void setTechnic_id(Integer technic_id) {
        this.technic_id = technic_id;
    }
}
