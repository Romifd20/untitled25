package com.company;

import java.util.Random;

public class Pet {
    private int age = generateDefaultAge();
    private Color color;
    private animal animal;

    public int getAge() {
        return age;
    }

    public Color getColor(Color color) {
        return this.color;
    }

    public com.company.animal getAnimal(com.company.animal animal) {
        return this.animal;
    }

    private int generateDefaultAge() {
        return new Random().nextInt(12) + 1;
    }


           public String getInfo(){return "Age ="+age+"\nColor = "+color+"\nAnimal = "+animal;}

}






