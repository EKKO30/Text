package com.it.Animal;
public class animal {
    public static void main(String[] args) {
       // animalcry(new cat());

        Animals animal=new dog();
        animal.shout();
        // animal.door;
        dog a=(dog)animal;
        animal.shout();
        a.shout();
        a.door();


    }

    static void animalcry(Animals a){
        a.shout();
    }
}

