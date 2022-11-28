package com.autoparts.general.entity;

import com.autoparts.general.enums.Body;
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

    @ManyToMany(mappedBy = "appropriateCars")
    private List<AutoPart> appropriateAutoParts;

}
