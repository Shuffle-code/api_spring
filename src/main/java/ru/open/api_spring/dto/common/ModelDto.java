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
    @NotBlank
//    @DecimalMin(value = "0.0", inclusive = false)
    @Digits(integer = 6, fraction = 2)
    private BigDecimal cost;
    @NotNull
    private Presence presence;
//    @NotNull
//    private Integer technicId;
    private String technology;

    private String category;

    private Integer countDoors;

    private String typeCompressor;

    private String typeProcessor;

    private String remember;

    private Integer countCameras;

    private Integer countDustCollector;

    private Integer countModes;

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

    public Integer getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(Integer countDoors) {
        this.countDoors = countDoors;
    }

    public Integer getCountCameras() {
        return countCameras;
    }

    public void setCountCameras(Integer countCameras) {
        this.countCameras = countCameras;
    }

    public Integer getCountDustCollector() {
        return countDustCollector;
    }

    public void setCountDustCollector(Integer countDustCollector) {
        this.countDustCollector = countDustCollector;
    }

    public Integer getCountModes() {
        return countModes;
    }

    public void setCountModes(Integer countModes) {
        this.countModes = countModes;
    }

//    public Technic getTechnicId() {
//        return technicId;
//    }
//
//    public void setTechnicId(Technic technicId) {
//        this.technicId = technicId;
//    }
//    public Integer getTechnicId() {
//        return technicId;
//    }
//
//    public void setTechnicId(Integer technicId) {
//        this.technicId = technicId;
//    }
}
