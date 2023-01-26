package com.it.Animal;

public class Animals {
    public void shout(){
        System.out.println("jiao");
    }
}
class dog extends Animals{
    public void shout() {
        System.out.println("汪汪");
    }
    public void door(){
        System.out.println("看门");
    }
}


class cat extends Animals{
    public void shout(){
            System.out.println("喵喵");
        }
}

