package com.it.textinterface;

public interface duojicheng {
    public static void main(String[] args) {
        a1 h=new a1();
        h.texta();
        h.textb();
        h.textc();
    }
}


interface A{
    void texta();
}

interface B{
    void textb();
}

interface C extends A,B{
     void textc();
}

class a1 implements C{

    @Override
    public void texta() {
        System.out.println("a1.texta");
    }

    @Override
    public void textb() {
        System.out.println("a1.textb");
    }

    @Override
    public void textc() {
        System.out.println("a1.textc");
    }
}
