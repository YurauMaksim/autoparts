package com.autoparts.general.entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "autoparts")
public class AutoPart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    private String name;
    private String code;
    private String image;
    private BigDecimal price;
    @ManyToMany
    @JoinTable(
            name = "parts_cars",
            joinColumns = @JoinColumn(name = "autopart_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id")
    )
    private List<Car> appropriateCars;

    
}
