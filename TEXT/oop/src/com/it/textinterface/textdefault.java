package com.it.textinterface;

public interface textdefault {

    void printf();

    default void moren(){
        System.out.println("默认方法");
        jingtai();//默认方法可以调用静态方法
    }
    public static void jingtai(){
        System.out.println("静态方法");//不需要子接口实现，他们互相独立
    }
}

class textdeafult1 implements textdefault{

    @Override
    public void printf() {
        System.out.println("打印一");
    }

    public static void jingtai(){
        System.out.println("静态方法一");//不需要子接口实现，他们互相独立
    }
}
