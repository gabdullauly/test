public class Person {
    String fullName;
    int age;
    public Person(){
    }
    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }
    String getData(){
        return fullName+" "+age;
    }
    void getMove(String a){
        System.out.print(a+" говорит");
    }
    void getTalk(String a){
        System.out.print(a+" говорит");
    }
}
