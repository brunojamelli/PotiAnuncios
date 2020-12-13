package com.poti.anuncios.models;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

public class Announcement {
    private Date dateCreation;
    private Date dateExpiration;
    private Category category;
    private Advertiser advertiser;
    private String title;
    private String description;
    private ArrayList<File> pictures;
    private boolean valid;
    private Administrator validateFor;

    public Announcement() {
    }

    public Announcement(Category category, Advertiser advertiser, String title, String description, ArrayList<File> pictures, boolean valid, Administrator validateFor) {
        this.dateCreation = new Date();
        this.dateExpiration = null;
        this.category = category;
        this.advertiser = advertiser;
        this.title = title;
        this.description = description;
        this.pictures = pictures;
        this.valid = valid;
        this.validateFor = validateFor;
    }
}
