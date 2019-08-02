package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "units")
public class Unit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "unitName")
    private String unitName;

    public Unit(String unitName) {
        this.unitName = unitName;
    }

    private Unit(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @Override
    @JsonProperty
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", unitName='" + unitName + '\'' +
                '}';
    }
}
