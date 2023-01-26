package Mathtext;
//Math类的应用
public class mathtext1 {
    public static void main(String[] args) {
        //求数的绝对值
        System.out.println(Math.abs(-231));
        System.out.println(Math.abs(-23.2));
        System.out.println("----------------------------------");

        //求最大值或最小值
        System.out.println(Math.max(4,1));
        System.out.println(Math.min(4,1));
        System.out.println("----------------------------------");

        //求算术平方根
        System.out.println(Math.sqrt(8));
        System.out.println("----------------------------------");

        //四舍五入（向大的数值进）
        System.out.println(Math.round(1.5));
        System.out.println(Math.round(-1.5));
        System.out.println("----------------------------------");

        //0.0<=0<1.0的随机数
        System.out.println(Math.random());

    }
}
