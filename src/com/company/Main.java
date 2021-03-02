package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.getName("Pusahtik");
        cat.getBreed("regdol");
        cat.getColor(Color.WHITE);
        cat.getTeam(new String[] {"whte cats", "two cats", "regdol cats"});
        cat.getAnimal(new animal("Animals","redisol"));


        System.out.println(cat.getInfo());
        cat.makeVoice("myy",3);

    }
}
