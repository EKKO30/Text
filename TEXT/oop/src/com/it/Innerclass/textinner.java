package com.it.Innerclass;

public class textinner {
    public static void main(String[] args) {
        textouter.inner s=new textouter().new inner();
        System.out.println(s.age);
        s.show();


    }
}
