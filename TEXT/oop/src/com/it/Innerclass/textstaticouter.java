package com.it.Innerclass;



class outer2{
    private int a=1;
    private static int b=2;

    static class inner2{
        public void x(){
       //    System.out.println(a);静态类不能调用非静态变量
            System.out.println(b);
        }
    }
}

public class textstaticouter {
    public static void main(String[] args) {
        outer2.inner2 s=new outer2.inner2();
        s.x();
    }
}
