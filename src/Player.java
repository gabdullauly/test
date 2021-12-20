/*
3) Создайте класс Player с параметрами:
int number;
String name;
String surname;
String position;
Player ()
Player (int number, String name, String surname, String position)
String getData();
Создать 10 экземпляров, отсортировать по его Number, вывести Игроков с четным индексом в массиве
 */

public class Player{
    int number;
    String name;
    String surname;
    String position;

    public Player(){}

    public Player(int number, String name, String surname, String position){
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.position = position;
    }

    String getData(){
        return number+" "+name+" "+surname+" "+position;
    }
}