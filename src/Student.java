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

public class Student {
int id;
String name;
String surname;
double gpa;

public Student(){}

public Student (int id, String name, String surname, double gpa){
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.gpa = gpa;
}

String getData (){
    return id+" "+name+" "+surname+" "+gpa;
}
}
