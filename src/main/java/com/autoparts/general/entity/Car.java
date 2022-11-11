package com.autoparts.general.entity;

import com.autoparts.general.enums.Body;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @ManyToOne(
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;
    @Column(name = "model_name")
    private String modelName;
    @Column(name = "vin_code")
    private String vinCode;
    @Enumerated(EnumType.STRING)
    @Column(name="body")
    private Body body;
    @Column(name = "engine_displacement")
    private double engineDisplacement;
    @Column(name = "date_built")
    private LocalDate dateOfBuilt;

    @ManyToOne(cascade =
            {CascadeType.DETACH,
            CascadeType.MERGE,
            CascadeType.PERSIST,
            CascadeType.REFRESH})
    @JoinColumn(name = "user_id")
    private User user;

    public Car() {
    }


    public Car(int id, Brand brand, String modelName, String vinCode, Body body, double engineDisplacement, LocalDate dateOfBuilt, User user) {
        this.id = id;
        this.brand = brand;
        this.modelName = modelName;
        this.vinCode = vinCode;
        this.body = body;
        this.engineDisplacement = engineDisplacement;
        this.dateOfBuilt = dateOfBuilt;
        this.user = user;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public double getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(double engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }

    public LocalDate getDateOfBuilt() {
        return dateOfBuilt;
    }

    public void setDateOfBuilt(LocalDate dateOfBuilt) {
        this.dateOfBuilt = dateOfBuilt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand=" + brand +
                ", modelName='" + modelName + '\'' +
                ", vinCode='" + vinCode + '\'' +
                ", body=" + body +
                ", engineDisplacement=" + engineDisplacement +
                ", dateOfBuilt=" + dateOfBuilt +
                ", user=" + user +
                '}';
    }
}
