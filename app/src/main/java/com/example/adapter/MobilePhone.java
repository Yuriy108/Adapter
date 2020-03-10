package com.example.adapter;

import androidx.annotation.NonNull;

public class MobilePhone {
    private String title;
    private String info;
    private int pictId;

    public MobilePhone(String title, String info, int pictId) {
        this.title = title;
        this.info = info;
        this.pictId = pictId;
    }

    public String getTitle() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getPictId() {
        return pictId;
    }

    @NonNull
    @Override
    public String toString() {
        return title;
    }
}
