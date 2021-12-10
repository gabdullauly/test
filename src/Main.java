import java.util.Scanner;

/*
Создать класс Person, который содержит:
a) поля fullName, age.
б) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то Person говорит".
в) Добавьте два конструктора - Person() и Person(fullName, age).
Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
c) создать 5 объектов и добавить в массив
d) найти самого старшего Person из массива по возрасту(max age)
 */

public class Main{
    public static void main (String[] args){
        Person person1 = new Person();
        person1.fullName = "Габдуллаулы Жандос";
        person1.age = 31;

        Person person2 = new Person("Габдулла Самал", 27);

        System.out.println(person1.getData());
        System.out.println(person2.getData());

        person1.getMove("Габдуллаулы Жандос");
        person2.getTalk("Габдулла Самал");

        Person person3 = new Person("Габдулла Айсана", 4);
        Person person4 = new Person("Габдулла Айназар", 0);
        Person person5 = new Person("Тлепова Тумекуль", 61);

        int [] arr = new int[5];
        int maxAge = -1;
        for (int i=0; i<5; i++){
            arr[0] = person1.age;
            arr[1] = person2.age;
            arr[2] = person3.age;
            arr[3] = person4.age;
            arr[4] = person5.age;

            if (arr[i]>maxAge){
                maxAge = arr[i];
            }
        }

        for (int i=0; i<5; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        if(maxAge==person1.age){
            System.out.println("Самый старший Person: "+person1.getData());
        }
        else if (maxAge==person2.age){
            System.out.println("Самый старший Person: "+person2.getData());
        }
        else if (maxAge==person3.age){
            System.out.println("Самый старший Person: "+person3.getData());
        }
        else if (maxAge==person4.age){
            System.out.println("Самый старший Person: "+person4.getData());
        }
        else if (maxAge==person5.age){
            System.out.println("Самый старший Person: "+person5.getData());
        }
    }
}
