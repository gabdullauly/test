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
Вы должны отсортировать массив в соответствии с их name в порядке убывания и распечатать их данные. Используйте пузырьковую сортировку.
 */

public class Main {
    static void getSortByGpa(Student[] mass){
        for (int i=0; i<mass.length-1; i++){
            for (int j=0; j< mass.length-i-1; j++){
                if (mass[j].name.compareTo(mass[j+1].name)>0){
                    Student temp = mass[j];
                    mass[j] = mass[j+1];
                    mass[j+1] = temp;
                }
            }
        }
    }

    public static void main (String[] args){
        Student student1 = new Student();
        student1.id = 1;
        student1.name = "Alex";
        student1.surname = "Ferguson";
        student1.gpa = 2.1;
        
        Student student2 = new Student(2, "Pep", "Guardoilla", 2.5);
        Student student3 = new Student(3, "Alessandro", "Poccetino", 2.13);
        Student student4 = new Student(4, "Frank", "Lampard", 1.8);
        Student student5 = new Student(5, "Xavi", "Barca", 2.4);
        
        Student[] arr = {student1, student2, student3, student4, student5};
        for (Student c:arr){
            System.out.println(c.getData());
        }

        System.out.println();
        System.out.println("------------------------------------");

        Student student6 = new Student(6, "Kilian", "Mbappe", 4.9);
        Student student7 = new Student(7, "Petr", "Cech", 3.1);
        Student student8 = new Student(8, "Yan", "Oblak", 3.3);
        Student student9 = new Student(9, "Oliver", "Khan", 3.4);
        Student student10 = new Student(10, "Lionel", "Messi", 4.5);

        Student[] arr2 = {student1, student2, student3, student4, student5, student6, student7, student8, student9, student10};
        for (Student a:arr2){
            System.out.println(a.getData());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        getSortByGpa(arr2);
        for (Student i:arr2){
            System.out.println(i.getData());
        }
    }
}
