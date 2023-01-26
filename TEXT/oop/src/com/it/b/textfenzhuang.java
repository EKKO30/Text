package com.it.b;

public class textfenzhuang {
    private int Id;
    private boolean man;
    private String name;


    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public boolean isMan() {
        return man;
    }

    public void setMan(boolean man) {
        this.man = man;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public textfenzhuang(int Id, boolean man, String name) {
        this.Id = Id;
        this.man = man;
        this.name = name;
    }
}
