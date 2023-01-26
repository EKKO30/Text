public class Student {
    private int age;
    private int number;
    private String name;
    public String dizhi;

    public Student(){

    }

    public Student(int age, int xuehao, String name, String dizhi) {
        this.age = age;
        this.number = xuehao;
        this.name = name;
        this.dizhi = dizhi;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getnumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDizhi() {
        return dizhi;
    }

    public void setDizhi(String dizhi) {
        this.dizhi = dizhi;
    }
}
