package com.github.pnowy.nc.mappers;

import com.github.pnowy.nc.spring.NativeBeanPropertyMapper;
import com.google.common.base.MoreObjects;

/**
 * Address DTO with supplier id as primitive long type.
 *
 * Primitive type in order to test {@linkplain NativeBeanPropertyMapper#isPrimitivesDefaultedForNullValue()} behavior.
 *
 * @author Przemek Nowak
 */
public class AddressPrimitiveDTO {
    private Long id;
    private String city;
    private String street;
    private String buildingNumber;
    private String zipCode;
    private long supplierId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public long getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(long supplierId) {
        this.supplierId = supplierId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("id", id)
            .add("city", city)
            .add("street", street)
            .add("buildingNumber", buildingNumber)
            .add("zipCode", zipCode)
            .add("supplierId", supplierId)
            .toString();
    }
}
