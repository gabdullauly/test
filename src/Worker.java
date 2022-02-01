import java.util.Arrays;

public class Worker extends User{
    private Integer salary;
    private String subjects[];

    public Worker(){}

    public Worker(Integer id, Integer age, String login, String password, String name,
                  String surname, Integer salary, String[] subjects){
        super(id, age, login, password, name, surname);
        this.salary = salary;
        this.subjects = subjects;
    }
    public Worker (Integer salary, String[] subjects){
        super ();
        this.salary = salary;
        this.subjects = subjects;
    }

    @Override
    public String toString (){
        String s = super.toString()+" "+salary+" ";
        for (int i=0; i<subjects.length; i++){
            s = s + subjects[i] + " ";
        }
        return s;
    }

    public Integer getSalary(){
        return salary;
    }

    public String[] getSubjects(){
        return subjects;
    }

    public void setSalary(Integer salary){
        this.salary = salary;
    }

    public void setSubjects(String [] subjects){
        this.subjects = subjects;
    }
}