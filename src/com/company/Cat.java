package com.company;

public class Cat extends Pet {
    private String name;
    private String breed;
    private String team;


    public Cat(){}


   public Cat(String name,String breed,Color color, animal animal){
        this.name = name;
                this.breed = breed;
                           super.getColor(color);
                           super.getAnimal(animal);


    }

    public Cat(String name,String breed,Color color,animal animal,String[] team){

    }
    public  String getName(String pusahtik){return  name;}

    public String getBreed(String regdol) {
        return breed;
    }

    public String getTeam(String[] strings) {
        return team;
    }

    public void makeVoice(String voice, int number) { for (int i = 0; i< number; i++){
        System.out.println(voice);


    }


    }

    public void makeVoice(String voice){
        System.out.println(voice);
    }

    public String getInfo(){
        return super.getInfo() +"\nName = "+ name + "\nBreed = " + breed + "\nteam = " + team;
    }
}
