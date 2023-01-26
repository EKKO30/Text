package commonclassestext;

import java.math.BigDecimal;

//Bigdecimal类的使用
public class bigdecimaltext {
    public static void main(String[] args) {
        //直接用基础数据类型加减乘除容易出现精度异常问题
        System.out.println(0.3+0.1);
        System.out.println(0.3-0.1);
        System.out.println(0.3*0.1);
        System.out.println(0.3/0.1);
        System.out.println("--------------------------------");

        //实列化对象直接用String不易出现问题
        BigDecimal a=new BigDecimal("0.3");
        BigDecimal b=new BigDecimal("0.1");
        BigDecimal c=new BigDecimal("0.2");
        BigDecimal d=new BigDecimal("0.7");
        System.out.println(a.add(b));//加法
        System.out.println(a.subtract(b));//减法
        System.out.println(a.multiply(c));//乘法
        System.out.println(d.divide(c));//除法，除不尽会报错
        System.out.println(d.divide(a,2,BigDecimal.ROUND_HALF_UP));//除法的重载方法，多了保留小数的位数和舍入模式
    }
}
