package com.autoparts.general.service;

import com.autoparts.general.entity.Brand;

import java.util.List;

public interface BrandService {
    void saveBrand(Brand brand);
    int getIdByName(String name);
    List<Brand> getAllBrands();




}
