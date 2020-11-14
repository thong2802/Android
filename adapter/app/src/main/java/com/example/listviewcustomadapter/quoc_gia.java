package com.example.listviewcustomadapter;

public class quoc_gia {
    private String name;
    private String populate;
    private int image;

    public quoc_gia(String name, String populate) {
        this.name = name;
        this.populate = populate;
        this.image = image;
    }

    public quoc_gia(String name, String populate, int image) {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPopulate() {
        return populate;
    }

    public void setPopulate(String populate) {
        this.populate = populate;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
