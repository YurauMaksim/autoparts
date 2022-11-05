package com.autoparts.general.entity;

import java.math.BigDecimal;

public class AutoPart {
    private String name;
    private String code;
    private String image;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "AutoPart{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", image='" + image + '\'' +
                ", price=" + price +
                '}';
    }
}
