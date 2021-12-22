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
В основном классе Main создайте 2 массива от разных игроков. (В каждом из них по 5 игроков).
 */

import com.sun.xml.internal.org.jvnet.mimepull.CleanUpExecutorFactory;

public class Club {
    private String name;
    private String country;
    private int ratingPoints;
    private Player[] players;

    public Club (){}

    public Club(String name, String country, int ratingPoints, Player[] players){
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public String toString(){
        String s = "";
        s = s+name+" "+country+" "+ratingPoints+"\n"; //System.out.println()
//        System.out.println(name+" "+country+" "+ratingPoints);
        for (int i=0; i<players.length; i++){
            s = s+players[i].toString();
        }
        return s;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCountry(String country){
        this.country = country;
    }

    public void setRatingPoints(int ratingPoints){
        this.ratingPoints = ratingPoints;
    }

    public void setPlayers(Player[] players){
        this.players = players;
    }

    public String getName(){
        return name;
    }

    public String getCountry(){
        return country;
    }

    public int getRatingPoints(){
        return ratingPoints;
    }

    public Player[] getPlayers(){
        return players;
    }
}