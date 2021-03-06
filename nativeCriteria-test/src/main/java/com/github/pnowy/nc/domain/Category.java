package com.github.pnowy.nc.domain;

import com.google.common.base.MoreObjects;

/**
 * Category entity.
 *
 * @author Przemek Nowak [przemek dot nowak dot pl at gmail.com]
 */
public class Category extends AbstractEntity {
    private String name;
    private String code;

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

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
            .add("name", name)
            .add("code", code)
            .toString();
    }
}
