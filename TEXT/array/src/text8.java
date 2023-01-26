import java.util.Arrays;

public class text8 {
    //冒泡排序
    public static void main(String[] args) {
        int[] a={3,213,55,44,553,231};
        System.out.println("原始顺序"+Arrays.toString(a));
        System.out.println(a.length);
        int t;
        for(int i=0;i<6;i++){
            for(int j=0;j<6-1-i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
            System.out.println("第"+(i+1)+"次顺序"+Arrays.toString(a));
        }
        System.out.println("最后顺序"+Arrays.toString(a));
    }
}
