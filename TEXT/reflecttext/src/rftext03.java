import java.lang.reflect.Field;

public class rftext03 {
    //通过Class获取类属性
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        Class c1=Student.class;
        Student student1=(Student) c1.newInstance();
        Student student=new Student(1,342,"fa","fklajsdlf");
        Field[] field1= c1.getFields();
        for(Field field:field1){
            System.out.println(field.getName());//其他是private修饰无法读取
        }
        System.out.println("------------------------");
        Field[] field2= c1.getDeclaredFields();
        for(Field field:field2){
            System.out.println(field.getName());
        }
    }
}
