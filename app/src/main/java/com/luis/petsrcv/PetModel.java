package com.luis.petsrcv;

public class PetModel {

    private final int imageResId;
    private final String name;
    private int rating;

    public PetModel(int imageResId, String name, int rating) {
        this.imageResId = imageResId;
        this.name = name;
        this.rating = rating;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getName() {
        return name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}
