package com.example.listviewnangcao;

public class Traicay {
    private String name;
    private String description;
    private int media;

    public Traicay(String name, String description, int media) {
        this.name = name;
        this.description = description;
        this.media = media;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMedia() {
        return media;
    }

    public void setMedia(int media) {
        this.media = media;
    }
}
