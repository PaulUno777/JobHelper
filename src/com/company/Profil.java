package com.company;

import java.util.ArrayList;

public class Profil {
    public ArrayList<String> attributes;

    public Profil() {
        this.attributes= new ArrayList<>();
    }

    public ArrayList<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<String> attributes) {
        this.attributes = attributes;
    }

    public void lookProfil(){
        System.out.println("your profil: ");
        for(String attr: this.attributes){
            System.out.println("- "+attr);
        }
    }
}
