package com.it.Innerclass;
//测试局部内部类
public class textjubudinner {

    public void a(){
        //作用域局限于该方法
        class inner3{
            void fun(){
                System.out.println("hello world");
            }
        }
        new inner3().fun();
    }

    public static void main(String[] args) {
        new textjubudinner().a();
    }
}
