package com.it.textabstract;

public abstract class chouxiang {

    abstract void run();
    abstract void eat();
    abstract void rest();

    public void shout(){
        System.out.println("chouxiang.shout");
    }
}

class dog extends chouxiang{

    @Override
    void run() {
        System.out.println("dog.run");
    }

    @Override
    void eat() {
        System.out.println("dog.eat");
    }

    @Override
    void rest() {
        System.out.println("dog.rest");
    }
}

class cat extends chouxiang{

    @Override
    void run() {
        System.out.println("cat.run");
    }

    @Override
    void eat() {
        System.out.println("cat.eat");
    }

    @Override
    void rest() {
        System.out.println("cat.rest");
    }
}


