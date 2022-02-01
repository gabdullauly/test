public class User {
    private Integer id;
    private Integer age;
    private String login;
    private String password;
    private String name;
    private String surname;

    public User (){}

    public User (Integer id, Integer age, String login, String password, String name, String surname){
        this.id = id;
        this.age = age;
        this.login = login;
        this.password = password;
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString (){
        return id+" "+age+" "+" "+login+" "+password+" "+name+" "+surname;
    }

    public Integer getId(){
        return id;
    }

    public Integer getAge(){
        return age;
    }

    public String getLogin(){
        return login;
    }

    public String getPassword(){
        return password;
    }

    public String getName(){
        return name;
    }

    public String getSurname(){
        return surname;
    }

    public void setId (Integer id){
        this.id = id;
    }

    public void setAge (Integer age){
        this.age = age;
    }

    public void setLogin (String login){
        this.login = login;
    }

    public void setPassword (String password){
        this.password = password;
    }

    public void setName (String name){
        this.name = name;
    }

    public void setSurname (String surname){
        this.surname = surname;
    }
}