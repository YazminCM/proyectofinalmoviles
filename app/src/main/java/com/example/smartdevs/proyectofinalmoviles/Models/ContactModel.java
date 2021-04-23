package com.example.smartdevs.proyectofinalmoviles.Models;

public class ContactModel {
    private String id;
    private String name;
    private String image;
    private String number;

    public ContactModel(String id, String name, String number, String img) {
        this.setId(id);
        this.setName(name);
        this.setNumber(number);
        this.setImage(img);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
