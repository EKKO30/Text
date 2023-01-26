import java.util.HashMap;

public class TEXT1 {
    public static void main(String[] args) {
        HashMap MapA=new HashMap<>();
        HashMap<Integer,Integer> MapB=new HashMap<>();

        MapB.put(1,2);
        MapB.put(2,3);
        MapB.put(45,342);
        MapB.put(123,343);
        MapA.putAll(MapB);
        Boolean a=MapA.containsKey(45);
        MapA.containsValue(342);
        System.out.println("MapA中有key为45的值吗"+a);
        System.out.println("MapB中有value为342的吗"+MapA.containsValue(342));
        MapA.clear();
    }
}
