import java.util.Scanner;

/*
Создайте класс под названием Student, который имеет параметры и методы:
int id
Имя строки String фамилия double gpa
Student () // конструктор по умолчанию
Student (int id, String name, String surname, double gpa)
String getData () // Этот метод возвращает все данные студента в одной строке в следующем формате Пример: ID: 1, Студент: Марат Маратов, GPA: 4.0
В основном классе вы должны создать не менее пяти объектов student, поместить их в массив и распечатать все их данные в строке.
Задача 2
Используйте предыдущий Student класс. Создайте не менее 10 объектов и поместите их в массив.
Вы должны отсортировать массив в соответствии с их gpa в порядке убывания и распечатать их данные. Используйте пузырьковую сортировку.
 */

public class Main{
    static void sortByGpa (Student[] student){
        for (int i=0; i<student.length-1; i++){
            for (int j=0; j<student.length-i-1; j++){
                if (student[j].gpa<student[j+1].gpa){
                    Student temp = student[j];
                    student[j] = student[j+1];
                    student[j+1] = temp;
                }
            }
        }
    }

    public static void main (String[] args){
        Student student1 = new Student();
        student1.id = 100;
        student1.name = "Alex";
        student1.surname = "Bolduin";
        student1.gpa = 3.4;

        Student student2 = new Student(200, "Lionel", "Messi", 4.19);
        Student student3 = new Student(300, "Cristiano", "Ronaldo", 4.0);
        Student student4 = new Student(400, "Ronaldinho", "Moreira", 3.8);
        Student student5 = new Student(500, "David", "Beckham", 3.5);

        Student[] students = {student1, student2, student3, student4, student5};

        for (Student c:students){
            System.out.println(c.getData());
        }

        Student student6 = new Student(600, "Kilian", "Mbappe", 4.1);
        Student student7 = new Student(700, "Junior", "Neimar", 3.9);
        Student student8 = new Student(800, "Frank", "Lampard", 3.3);
        Student student9 = new Student(900, "Didie", "Drogba", 3.6);
        Student student10 = new Student(1000, "Mo", "Salah", 3.7);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        Student[] studentsAll = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};

        sortByGpa(studentsAll);
        for (Student c:studentsAll){
            System.out.println(c.getData());
        }
    }
}