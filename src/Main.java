
/*
Класс Phone.
а) Создайте класс Phone, который содержит переменные number, model и weight.
б) Создайте три экземпляра этого класса.
в) Выведите на консоль значения их переменных.
г) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
 */

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("87761135930", "Samsung", 5.6);
        Phone phone2 = new Phone("87761135920", "iPhone", 4.6);
        Phone phone3 = new Phone("87714145580", "OnePlus", 6.2);

        System.out.println(phone1.getData());
        System.out.println(phone2.getData());
        System.out.println(phone3.getData());

        phone1.receiveCall("Жандос");

        System.out.println();
        Phone phone4 = new Phone();
        phone4.number = "87771115599";
        phone4.model = "Huawei";
        phone4.weight = 5.5;

        System.out.println(phone4.getData());

        phone4.receiveCall("Даурбек");
    }
}