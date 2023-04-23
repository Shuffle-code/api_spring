package ru.open.api_spring.entity;
import ru.open.api_spring.entity.common.enums.Presence;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table (name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "serial_number")
    private String serialNumber;

    @Column(name = "color")
    private String color;

    @Column(name = "size")
    private String size;

    @Column(name = "cost")
    private BigDecimal cost;

    @Column(name = "category")
    private String category;

    @Column(name = "technology")
    private String technology;

    @ManyToOne
    @JoinColumn(name = "technic_id")
    private Technic technic;

    @Enumerated(EnumType.STRING)
    @Column(name = "PRESENCE")
    private Presence presence;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
//    @Override
//    public String toString() {
//        return "Model{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", serialNumber='" + serialNumber + '\'' +
//                ", color='" + color + '\'' +
//                ", size='" + size + '\'' +
//                ", cost=" + cost +
//                ", category='" + category + '\'' +
//                ", technology='" + technology + '\'' +
//                ", technic=" + technic +
//                ", presence=" + presence +
//                '}';
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public Technic getTechnic() {
        return technic;
    }

    public void setTechnic(Technic technic) {
        this.technic = technic;
    }

    public Presence getPresence() {
        return presence;
    }

    public void setPresence(Presence presence) {
        this.presence = presence;
    }
}

