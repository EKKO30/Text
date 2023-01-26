package com.it;

public class TEXT01 {
    public static void main(String[] args) {
        student sd1 = new student(19, "xx", "xxx");
        System.out.println(sd1.age);
        System.out.println(sd1 instanceof person);
        sd1.study();
    }
}
class person{
    int age;
    String name;
    public void rest(){
        System.out.println("休息！");
        }
    }
class student extends person{
    String major;

    public void study(){
        System.out.println("学习！");
        rest();
    }
    public student(int age,String name,String major){
        this.age=age;
        this.name=name;
        this.major=major;
        }
    }

