package com.example.customlistview;

public class Player {
    String name;
    int imgDrawableId;

    public Player(String name, int imgDrawableId) {
        this.name = name;
        this.imgDrawableId = imgDrawableId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImgDrawableId() {
        return imgDrawableId;
    }

    public void setImgDrawableId(int imgDrawableId) {
        this.imgDrawableId = imgDrawableId;
    }


}
