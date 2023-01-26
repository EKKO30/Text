public class text1 {
    public static void main(String[] args) {
        int s[];
        s =new int[10];
        for(int i=0;i<10;i++){
            s[i]=i*3+3;
            System.out.println(s[i]);
        }
        Man[] man=new Man[10];
        Man m1=new Man(11,333);
        Man m2=new Man(12,222);
        man[0]=m1;
        man[1]=m2;
        System.out.println(man[0].getAge());
    }
}

class Man{
    private int age;
    private int id;

    public Man(int age,int id){
        this.age=age;
        this.id=id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}