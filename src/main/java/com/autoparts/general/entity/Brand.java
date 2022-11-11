package com.autoparts.general.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "brand")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "brand_name")
    private String brandName;

    @OneToMany(mappedBy = "brand", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @Column(name = "car_id")
    private List<Car> cars;

    public Brand() {
    }

    public Brand(int id, String brandName, List<Car> cars) {
        this.id = id;
        this.brandName = brandName;
        this.cars = cars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "id=" + id +
                ", brandName='" + brandName + '\'' +
                '}';
    }
}
