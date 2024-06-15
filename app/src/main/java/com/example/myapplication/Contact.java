package com.example.myapplication;

public class Contact {
    private int avatarId;
    private String name;

    public Contact(String name, int imageId) {
        this.name = name;
        this.avatarId = imageId;
    }
    public String getName() {
        return name;
    }
    public int getAvatarId() {
        return avatarId;
    }
}