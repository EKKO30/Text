package com.it;

public class textsuper {


    public static void main(String[] args) {
        new c().f();
    }
}

    class f{
        int age;

        public void f(){
            age=45;
            System.out.println("classf.age="+age);
        }

    }

    class c extends f{
        int age;
        public void f(){
            super.f();
            age=20;
            System.out.println("c.age="+age);
            System.out.println(super.age);

        }
    }
