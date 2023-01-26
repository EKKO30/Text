import java.util.Scanner;

public class scranner {
    public static void main(String[] args) {
        System.out.println("输入你的名字");
        Scanner scanner=new Scanner(System.in);
        String a= scanner.nextLine();
        System.out.println("名字是"+a);
        scanner.close();
    }
}