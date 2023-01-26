package com.it;

import java.util.Objects;

public class textequals {
    String id;
    String name;
    String pwd;

    public textequals(String id, String name, String pwd) {
        this.id = id;
        this.name = name;
        this.pwd = pwd;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        textequals that = (textequals) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(pwd, that.pwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pwd);
    }

    public static void main(String[] args){
        textequals t=new textequals("123","g","123456");
        textequals s=new textequals("123","g","123496");
        System.out.println(t.equals(s));



    }
}
