package com.poti.anuncios;

import com.poti.anuncios.models.Advertiser;
import com.poti.anuncios.models.Announcement;

public class Main {

    public static void main(String[] args) {
        Advertiser a1 = new Advertiser();
        a1.setEmail("email@gmail.com");
        a1.setName("name");
        a1.setPassword("pwdhaiahau");
        a1.setWhatsapp("987050775");
        System.out.println(a1);
    }
}
