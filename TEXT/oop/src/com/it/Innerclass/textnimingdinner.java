package com.it.Innerclass;
//测试匿名内部类
public class textnimingdinner {

    public void x(A a){
        a.run();
    }

    public static void main(String[] args) {
       textnimingdinner t=new textnimingdinner();
       t.x(new A() {
           @Override
           public void run() {
               System.out.println("第一个匿名类");
           }
       });
       t.x(new A() {
           @Override
           public void run() {
               System.out.println("第二个匿名类");
           }
       });

    }

}

interface A{
    void run();
}