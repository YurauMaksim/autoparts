package com.autoparts.general.service;

import com.autoparts.general.dao.BrandRepository;
import com.autoparts.general.entity.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {
    BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    public void saveBrand(Brand brand){
        brandRepository.save(brand);
    }

    @Override
    public int getIdByName(String name) {
        return brandRepository.getIdFromBrand(name);
    }


    public List<Brand> getAllBrands() {
        return brandRepository.findAll();
    }


}
