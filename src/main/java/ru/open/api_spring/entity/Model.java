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

    @Column(name = "type_processor")
    private String typeProcessor;

    @Column(name = "remember")
    private String remember;

    @Column(name = "count_cameras")
    private String countCameras;

    @Column(name = "count_doors")
    private String countDoors;

    @Column(name = "count_modes")
    private String countModes;

    @Column(name = "count_dust_collector")
    private String countDustCollector;

    @Column(name = "type_compressor")
    private String typeCompressor;

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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public String getCountDoors() {
        return countDoors;
    }

    public void setCountDoors(String countDoors) {
        this.countDoors = countDoors;
    }

    public String getCountModes() {
        return countModes;
    }

    public void setCountModes(String countModes) {
        this.countModes = countModes;
    }

    public String getCountDustCollector() {
        return countDustCollector;
    }

    public void setCountDustCollector(String countDustCollector) {
        this.countDustCollector = countDustCollector;
    }

    public String getTypeCompressor() {
        return typeCompressor;
    }

    public void setTypeCompressor(String typeCompressor) {
        this.typeCompressor = typeCompressor;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", cost=" + cost +
                ", category='" + category + '\'' +
                ", technology='" + technology + '\'' +
                ", technic=" + technic +
                ", presence=" + presence +
                ", typeProcessor='" + typeProcessor + '\'' +
                ", remember='" + remember + '\'' +
                ", countCameras='" + countCameras + '\'' +
                ", countDoors='" + countDoors + '\'' +
                ", countModes='" + countModes + '\'' +
                ", countDustCollector='" + countDustCollector + '\'' +
                ", typeCompressor='" + typeCompressor + '\'' +
                '}';
    }
}

