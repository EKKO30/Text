public class text4 {
    //测试异常
    public static void main(String[] args) {
        person a=new person();
        try {
            a.setAge(-23);
        } catch (illegaException e) {
            e.printStackTrace();
        }
        a.print();
    }

}

class person{
    int age;
    String name;

    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age) throws illegaException{
        if (age < 0) {
            throw new illegaException("人的年龄不能为负数");
        }
        this.age=age;
    }
    public void print(){
        System.out.println(this.name+this.age);
    }
}


