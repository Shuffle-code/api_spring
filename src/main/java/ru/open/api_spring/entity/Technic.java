package ru.open.api_spring.entity;
import org.hibernate.annotations.Where;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import ru.open.api_spring.entity.common.enums.Presence;
import ru.open.api_spring.entity.common.enums.TypeTechnics;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table (name = "technic")
@EntityListeners(AuditingEntityListener.class)
public class Technic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "MANUFACTURE_COUNTRY")
    private String manufactureCountry;

    @Column(name = "MANUFACTURE")
    private String manufacture;
    @Enumerated(EnumType.STRING)
    @Column(name = "ORDER_ON")
    private Presence orderOn;
    @Enumerated(EnumType.STRING)
    @Column(name = "CREDIT")
    private Presence credit;

    @Enumerated(EnumType.STRING)
    @Column(name = "TYPE_TECHNIC")
    private TypeTechnics typeTechnic;
    @OneToMany(mappedBy = "technic", cascade = CascadeType.MERGE)
    @Where(clause = "presence = 'AVAILABLE'")
    private Set<Model> models;

    @Override
    public String toString() {
        return "Technic{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", manufactureCountry='" + manufactureCountry + '\'' +
                ", manufacture='" + manufacture + '\'' +
                ", orderOn=" + orderOn +
                ", credit=" + credit +
                ", typeTechnic=" + typeTechnic +
                ", models=" + models +
                '}';
    }

    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Presence getOrderOn() {
        return orderOn;
    }

    public void setOrderOn(Presence orderOn) {
        this.orderOn = orderOn;
    }

    public Presence getCredit() {
        return credit;
    }

    public void setCredit(Presence credit) {
        this.credit = credit;
    }

    public TypeTechnics getTypeTechnic() {
        return typeTechnic;
    }

    public void setTypeTechnic(TypeTechnics typeTechnic) {
        this.typeTechnic = typeTechnic;
    }

    //    @Column(name = "PRESENCE")
//    private String presence;
}
