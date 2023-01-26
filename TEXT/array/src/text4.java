
import java.util.Arrays;

public class text4 {
    //数组拷贝，排序，查找，填充
    public static void main(String[] args) {
        String[] a={"成都","重庆","长沙","深圳"};
        String[] b=new String[5];
        System.arraycopy(a,0,b,1,4);
        for(String t:b){
            System.out.println(t);
        }
        int[] s={32,44,33,22};
        System.out.println(Arrays.toString(s));//输出数组
        System.out.println(s);
        Arrays.sort(s);//由小到大排序
        System.out.println(Arrays.toString(s));
        System.out.println("该元素下标"+Arrays.binarySearch(s,13));//二分法查找元素，查前需排序
        System.out.println("该元素下标"+Arrays.binarySearch(s,33));

        int[] c={11,22,33,44};
        Arrays.fill(c,2,4,2444);
        System.out.println(Arrays.toString(c));//填充元素
    }
}
