package com.autoparts.general.dao;

import com.autoparts.general.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BrandRepository extends JpaRepository<Brand, Integer> {
    @Query( value = "SELECT id FROM brand WHERE brand_name = ?1",
            nativeQuery = true)
    Integer getIdFromBrand(String brandName);

}
