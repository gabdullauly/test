import java.util.Scanner;

/*
Создать класс Person, который содержит:
a) поля fullName, age.
б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то Person говорит".
в) Добавьте два конструктора - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).

 */

public class Main{
    public static void main (String[] args){
        Person person1 = new Person("Габдуллаулы Жандос", 31);
        Person person2 = new Person();
        person2.fullName = "Габдулла Самал";
        person2.age = 27;
        System.out.println(person1.getData());
        System.out.println(person2.getData());
        person1.getMove("Габдуллыулы Жандос");
        System.out.println();
        person2.getTalk("Габдулла Самал");
    }
}
