package com.example.videoplayer;

public class IconModel {
    private int imageView;
    private String imageTitle;

    public IconModel(int imageView, String imageTitle) {
        this.imageView = imageView;
        this.imageTitle = imageTitle;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getImageTitle() {
        return imageTitle;
    }

    public void setImageTitle(String imageTitle) {
        this.imageTitle = imageTitle;
    }
}
