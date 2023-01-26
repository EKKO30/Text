public class textString2 {
    public static void main(String[] args) {

        String s="";
        String s1="How are you";
        System.out.println(s1.startsWith("How"));//开头是否是How
        System.out.println(s1.endsWith("you"));//结尾是否是you
        s=s1.substring(5);//从下标[5，结束)
        System.out.println(s);
        s=s1.substring(2,5);//从下标为[2,5)的位置
        System.out.println(s);
        s=s1.toLowerCase();//转小写
        System.out.println(s);
        s=s1.toUpperCase();//转大写
        System.out.println(s);
        String s2=" How old are you ";
        s=s2.trim();//返回一个去除收尾空格，中间不管的新字符串，原字符串不变
        System.out.println(s);
        System.out.println(s2);
    }
}
