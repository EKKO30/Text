package Zhan;

public class text2 {
    public static void main(String[] args) {
        //测试栈
/*        text1<String> a1=new text1<>();
        a1.push("A");
        a1.push("B");
        a1.push("C");
        a1.pop();
        a1.pop();
        a1.pop();*/
        System.out.println("------------");
        //测试队列
        text3<String> b1=new text3<>();
        b1.push("A");
        b1.push("B");
        b1.pop();
        b1.push("C");
        b1.pop();
        b1.push("D");
    }
}
