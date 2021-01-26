package com.wambly.GeoBusiness.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Business {
    @Id
    private String id;
    private String email;
    private String phone;
    private String name;
    private String category;
    private Location location;

    public Business() {
    }

    public Business(String id, String email, String phone, String name, String category, Location location) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.category = category;
        this.location = location;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
