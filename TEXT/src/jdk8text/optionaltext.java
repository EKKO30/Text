package jdk8text;

import java.util.Optional;

public class optionaltext {
    public static void main(String[] args) {
        optionaltext o=new optionaltext();
        Integer a= 2;
        Integer b=10;

        //允许传入null值
        Optional<Integer> op1=Optional.ofNullable(a);
        //不允许传入null值，传入报错
        Optional<Integer> op2=Optional.of(b);

        System.out.println(o.addnum(op1, op2));

    }
    public Integer addnum(Optional<Integer> op1,Optional<Integer> op2){
        //判断参数是否存在
        System.out.println("第一个参数是否存在"+op1.isPresent());
        System.out.println("第二个参数是否存在"+op2.isPresent());

        //orElse如果有值就用值，没有就返回默认值
        Integer a=op1.orElse(new Integer(0));//如果a=null 则a-->0
        op1.ifPresent(integer -> {
            System.out.println("执行方法体");
        });
        Integer b=op2.get();
        return a+b;
    }
}
