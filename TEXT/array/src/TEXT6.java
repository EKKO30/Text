import java.util.Arrays;

public class TEXT6 {
    //JAVAbean和数组表格保存
    public static void main(String[] args) {
        student[] emps={
                new student(101,"a",12),
                new student(102,"b",13),
                new student(103,"c",14)
        };
        for(student t:emps){
            System.out.println(t.toString());
        }
    }

}



class student{
    private int id;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}