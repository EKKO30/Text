package shunxubiao;

import shunxubiao.text1;

public class text2 {
    public static void main(String[] args) {
        //顺序表测试
   //     text1<String> a1 = new text1<>();
    //    a1.add("A",0);
    //    a1.add("N",0);
    //    a1.remove(0);
        text3<String> b2=new text3<>();
        b2.add("A",0);
        b2.add("B",0);
        System.out.println("------------debug-----------------");
        b2.remove(0);
        b2.get(1);
    }
}