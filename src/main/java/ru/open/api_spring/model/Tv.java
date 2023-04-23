package ru.open.api_spring.model;
import io.swagger.v3.oas.annotations.media.Schema;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Schema(description = "информация")
public class Tv {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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

//    @ManyToOne
//    @JoinColumn(name = "technic_id")
//    private Technic technic;

//    @Enumerated(EnumType.STRING)
//    @Column(name = "PRESENCE")
//    private Presence presence;

}
