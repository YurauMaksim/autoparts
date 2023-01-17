package com.autoparts.general.entity;

import com.autoparts.general.enums.Body;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "car")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

    @JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne(
            cascade = {CascadeType.REFRESH},
            fetch = FetchType.LAZY, targetEntity = Brand.class)
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @JsonSetter("name")
    @Column(name = "model_name")
    private String modelName;
    @JsonIgnore
    @Enumerated(EnumType.STRING)
    @Column(name="body")
    private Body body;
    @JsonIgnore
    @Column(name = "engine_displacement")
    private double engineDisplacement;
    @JsonSetter("year-from")
    @Column(name = "date_built")
    private int dateOfBuilt;

    @ManyToMany(mappedBy = "appropriateCars")
    private List<AutoPart> appropriateAutoParts;

    public Car(Brand brand, String modelName, Body body, double engineDisplacement, int dateOfBuilt) {
        this.brand = brand;
        this.modelName = modelName;
        this.body = body;
        this.engineDisplacement = engineDisplacement;
        this.dateOfBuilt = dateOfBuilt;
    }
}
