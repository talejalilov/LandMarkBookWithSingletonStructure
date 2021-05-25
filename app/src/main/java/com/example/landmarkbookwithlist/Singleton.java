package com.example.landmarkbookwithlist;

import android.graphics.Bitmap;

public class Singleton {

    Bitmap selectedImage;

    private static Singleton singleton;

    public Singleton() {
         ;
    }

    public Bitmap getSelectedImage() {
        return selectedImage;
    }

    public void setSelectedImage(Bitmap selectedImage) {
        this.selectedImage = selectedImage;
    }

    public static Singleton getInstance(){
        if(singleton==null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
