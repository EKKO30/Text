import java.util.Arrays;

public class text10 {
    //优化冒泡排序
    public static void main(String[] args) {
        int[] a={3,2,1,4,7,6};
        System.out.println("原始顺序"+ Arrays.toString(a));
        int t;
        for(int i=0;i<6;i++){
            boolean c=true;
            for(int j=0;j<6-1-i;j++){
                if(a[j]>a[j+1]){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                    c=false;
                }
            }
            if(c){
                break;
            }
            System.out.println("第"+(i+1)+"次顺序"+Arrays.toString(a));
        }
    }
}
