package com.coco.listviewleftswipe;

/**
 * Created by ydx on 18-7-20.
 */

public class Person {
    private String name;
    private int ImageId;

    public Person(String name, int ImageId){
        this.name = name;
        this.ImageId = ImageId;
    }
    public String getName(){
        return name;
    }
    public int getImageId(){
        return ImageId;
    }
}
