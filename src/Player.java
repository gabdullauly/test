/*
Создайте класс Player с параметрами:
-int number;
-String name;
-String surname;
-String position;
Getter/setter
+Player ()
+Player (int number, String name, String surname, String position)

Создайте класс Club с параметрами:
-String name;
-String country;
-int ratingPoints;
-Player [] players;
Getter/setter
+Club ()
+Club (String name, String country, int ratingPoints, Player [] players)
+void printClubData (); // Этот метод отображает информацию о клубе, включая список всех игроков, присутствующих в массиве.
<<<<<<< Updated upstream
В основном классе Main создайте 2 массива от разных игроков. (В каждом из них по 5 игроков).
 */

=======
В основном классе Main создайте 2 массива из игроков (в каждом из них по 5 игроков) и два клуба из разных клубов.
 */


>>>>>>> Stashed changes
public class Player {
    private int number;
    private String name;
    private String surname;
    private String position;

<<<<<<< Updated upstream
    public Player(){}

    public Player(int number, String name, String surname, String position){
=======
    public Player(){};

    public Player (int number, String name, String surname, String position){
>>>>>>> Stashed changes
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

<<<<<<< Updated upstream
    public void setNumber(int number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setPosition(String position){
=======
    public void setNumber(Integer number){
        this.number = number;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setSurname (String surname){
        this.surname = surname;
    }

    public void setPosition (String position){
>>>>>>> Stashed changes
        this.position = position;
    }

//    public Integer getNumber(){
//        return number;
//    }
//
//    public String getName(){
//        return name;
//    }
//
//    public String getSurname(){
//        return surname;
//    }
//
//    public String getPosition(){
//        return position;
//    }

    public String toString(){
        return number+" "+name+" "+surname+" "+position+"\n";
<<<<<<< Updated upstream

    }
}
=======
    }
}
>>>>>>> Stashed changes
