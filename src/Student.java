import java.util.Arrays;

public class Student extends User{
    private String[] courses;

    public Student(){}

    public Student(Integer id, Integer age, String login, String password, String name, String surname, String[] courses){
        super (id, age, login, password, name, surname);
        this.courses = courses;
    }

    @Override
    public String toString (){
        return super.toString()+" "+ Arrays.toString(courses);
    }

    public String[] getCourses(){
        return courses;
    }

    public void setCourses(String[] courses){
        this.courses = courses;
    }
}