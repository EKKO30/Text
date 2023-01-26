package com.it;

public class textoverride {

    public static void main(String[] args) {
        boy s2=new boy();
        gril s3=new gril();
        s2.clare();
        s3.clare();
    }

}

class person1{
    int age;
    String name;
    String gender;
    public void clare(){
        System.out.println("我是人");
    }
}
class boy extends person1{
    public void clare(){
        System.out.println("我是男人");
    }
}
class gril extends person1{
    public void clare(){
        System.out.println("我是女人");
    }
}
