package com.example.myapplication;

public class friends {

    private int id;
    private String name;
    private int dob;
    private String city;
    private int imgId;

    public friends(int id, String name, int dob, String city,int imgid) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.city = city;
        this.imgId=imgid;

    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDob() {
        return dob;
    }

    public String getCity() {
        return city;
    }


    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }


}
