package com.it.Innerclass;

public class textouter {

    int age=20;

    public void show(){
        System.out.println("textouter.show");
        System.out.println(age);
    }


    class inner{
        int age=10;

        public void show(){
            System.out.println("inner.show");
            System.out.println(age);
            System.out.println(textouter.this.age);
            textouter.this.show();
        }
    }
}





