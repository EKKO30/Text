
import java.util.ArrayList;
import java.util.List;

public class TEXT1 {
    public static void main(String[] args) {
        List ListA=new ArrayList<>();
        ArrayList ListB=new ArrayList<>();
        List<String> ListC=new ArrayList<>();
        ArrayList<String> ListD=new ArrayList<>();

        ListC.add("hjcdsajkfk");
        ListC.add("cicji");
        ListD.addAll(ListC);
        for(String t:ListD){
            System.out.println(t);
        }//元素类型唯一才能用

        ListA.add(1);
        ListA.add(2);
        ListA.add("fadsfasd");
        ListB.addAll(ListA);
        for(int x=0;x<ListB.size();x++){
            System.out.println("ListB中元素有"+ListB.get(x));
        }
        for(Object t:ListA){
            System.out.println(t);
        }
        ListA.clear();//清除所有元素
        System.out.println("ListA中的元素个数"+ListA.size());
        System.out.println("ListC中有整数1吗？"+ListB.contains(1));

    }
}
