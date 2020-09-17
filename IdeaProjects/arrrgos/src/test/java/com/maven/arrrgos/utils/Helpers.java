package com.maven.arrrgos.utils;

import com.maven.arrrgos.driverfactory.DriverFactory;

import java.util.Random;

public class Helpers extends DriverFactory {
    //to select product randomly we write random

    public int random(int size){
        Random random = new Random();
        return random.nextInt(size-1);
    }
}

