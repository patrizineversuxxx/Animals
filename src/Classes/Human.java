package Classes;

import Interfaces.Animal;
import Interfaces.Mamal;

public class Human implements Mamal {
    private int age;
    private boolean sex;
    private boolean dead = false;

    public boolean getDead(){
        return dead;
    }

    public Human(int age, char sex) {
        this.age = age;
        if (Character.toLowerCase(sex)=='m')this.sex = true;
            else {this.sex = false;}
        this.dead = false;
    }



    @Override
    public void sleep() {
        System.out.println("Hrrrr hrrr");
    }

    @Override
    public void eat(int foodsCount) {
        for (int i=0; i<foodsCount; i++){
            System.out.println("Such a nice cheesyDay!");
            if (i>=5){
                System.out.println("I'm done.");
                break;
            }
        }
    }

    @Override
    public void sound() {
        System.out.println("Hello world!");
    }

    @Override
    public void die() {
        System.out.println("I'm so sorry...");
        dead = true;
    }

    @Override
    public void drinkMilk() {
        System.out.println("Nice milk");
    }

    public void killAnimal(Animal name){
        System.out.println("Bang! Bang! Bang! Bang!");
        name.die();
    }
}
