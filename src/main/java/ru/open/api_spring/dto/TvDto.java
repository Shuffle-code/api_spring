package ru.open.api_spring.dto;

import ru.open.api_spring.dto.common.ModeBaseDto;
import javax.validation.constraints.NotNull;
public class TvDto extends ModeBaseDto {
//    private Long id;
//    @NotBlank
//    private String name;
//    @NotBlank
//    private String serialNumber;
////    @NotBlank
//    private String color;
//    @NotBlank
//    private String size;
//    @NotNull
//    @DecimalMin(value = "0.0", inclusive = false)
//    @Digits(integer = 6, fraction = 2)
//    private BigDecimal cost;
    @NotNull
    private String technology;

//    @NotNull
//    private Presence presence;
//    @NotNull
//    private Technic technic;
    @NotNull
    private String category;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getSerialNumber() {
//        return serialNumber;
//    }
//
//    public void setSerialNumber(String serialNumber) {
//        this.serialNumber = serialNumber;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getSize() {
//        return size;
//    }
//
//    public void setSize(String size) {
//        this.size = size;
//    }
//
//    public BigDecimal getCost() {
//        return cost;
//    }
//
//    public void setCost(BigDecimal cost) {
//        this.cost = cost;
//    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

//    public Presence getPresence() {
//        return presence;
//    }
//
//    public void setPresence(Presence presence) {
//        this.presence = presence;
//    }
//
//    public Technic getTechnic() {
//        return technic;
//    }
//
//    public void setTechnic(Technic technic) {
//        this.technic = technic;
//    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "TvDto{" +
                "technology='" + technology + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}
