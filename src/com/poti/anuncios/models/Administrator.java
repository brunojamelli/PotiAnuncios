package com.poti.anuncios.models;

public class Administrator extends User{
    private String position;

    public Administrator(String name, String whatsapp, String position) {
        super(name, whatsapp);
        this.position = position;
    }

    public Administrator(String position) {
        this.position = position;
    }

    public Administrator() {
    }
}
