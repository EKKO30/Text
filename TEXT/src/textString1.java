public class textString1 {
    public static void main(String[] args) {

        String s1="study java";
        String s2="Study java";

        System.out.println(s1.charAt(5));//提取下标为4的字符
        System.out.println(s1.length());//字符串长度
        System.out.println(s1.equals(s2));//比较两个字符内容是否相等
        System.out.println(s1.equalsIgnoreCase(s2));//忽略大小写
        System.out.println(s1.indexOf("java"));//s1是否包含java,并返回他的位置
        System.out.println(s1.indexOf("ag"));//没有则返回-1
        String s=s1.replace("s","g");//修改字符返回一个新字符串，原字符串不变
        System.out.println(s);
        System.out.println(s1);
        String s3="Study java,java";
        System.out.println(s3.lastIndexOf("java"));//反向寻找java，并返回他的位置
        System.out.println(s3.indexOf("java"));

    }
}
