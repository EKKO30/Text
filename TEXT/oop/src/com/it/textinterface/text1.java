package com.it.textinterface;

public interface text1 {
    int fly_hight=10;

    void fly();
}

interface goodman{
    void helpothers();
}

class bird implements text1{

    @Override
    public void fly() {
        System.out.println("我用翅膀飞");
    }
}

class man implements goodman{
    public void helpothers(){
        System.out.println("man.helpothers");
    }
}

class angel implements text1,goodman{

    @Override
    public void fly() {
        System.out.println("angel.fly");
    }

    @Override
    public void helpothers() {
        System.out.println("angel.helpothers");
    }
}