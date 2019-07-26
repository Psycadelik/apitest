package com.example.demo;
import javax.persistence.*;
import java.lang.annotation.Native;

@Entity
@Table(name="universities")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "university_name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    public University(String name, String location, int capacity, double latitude, double longitude) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    private University(){}

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "University{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}