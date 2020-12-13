package com.poti.anuncios.models;

public class Administrator extends User{
    private String position;

    public Administrator(String name, String whatsapp, String email, String password, String position) {
        super(name, whatsapp, email, password);
        this.position = position;
    }

    public Administrator(String position) {
        this.position = position;
    }

    public Administrator() {
    }
}
