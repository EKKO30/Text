
import java.util.Arrays;
public class text7 {
    //compare able排序
    public static void main(String[] args) {
        int[] b={12,33,44,55,33};
        Man3[] a={new Man3(12,"a"),
                new Man3(1,"e"),
                new Man3(142,"r")};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        }
    }



class Man3 implements Comparable{
    int age;
    String name;

    @Override
    public String toString() {
        return this.name;
    }

    public Man3(int age, String name){
        this.age=age;
        this.name=name;
    }


    @Override
    public int compareTo(Object o) {
        Man3 man3=(Man3)o;
        if(this.age<man3.age){
            return -1;
        }
        if(this.age>man3.age){
            return 1;
        }
        return 0;
    }
}
