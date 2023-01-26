import java.util.HashSet;
import java.util.Iterator;

public class t {
    public static void main(String[] args) {
        HashSet a1=new HashSet();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(4);

        //迭代器
        Iterator<Iterator> a2=a1.iterator();
        //a2.hasNext()判断下一个是否还有元素
        while(a2.hasNext()){
            System.out.println(a2.next());
        }
    }
}
