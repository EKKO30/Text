import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class rftext02 {
    //通过Class获取Student对象
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1=Student.class;
        Student student1=(Student) c1.newInstance();
        //正向通过对象来设置student1的属性
        student1.setName("ekko");
        System.out.println(student1.getName());
        Method SetNumbermethod= c1.getMethod("setXuehao", int.class);
        //通过反射反向设置student1的属性
        SetNumbermethod.invoke((Student)student1,4);
        System.out.println(student1.getnumber());

        System.out.println("--------------------------");

        Class c2=Student.class;
        Constructor constructor=c2.getConstructor();
        Student student2=(Student) constructor.newInstance();
        //getClass()是Object类的方法
        System.out.println(student2.getClass());
        student2.setName("ekko1");
        System.out.println(student2.getName());
    }
}
