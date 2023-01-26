public class StudentSubject1 <T extends Number>  {//上限为Number，只能写数字
    //泛型的界限
    String name;
    int id;
    T score;
    public StudentSubject1(){}

    public StudentSubject1(String name,int id,T score){
        this.name=name;
        this.id=id;
        this.score=score;
    }

    public static <E> void printing(E e){
        System.out.println(e);
    }

}

