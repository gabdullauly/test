import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner www = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a = www.nextInt();
        System.out.print("Введите число B: ");
        int b = www.nextInt();
        System.out.print("Введите число C: ");
        int c = www.nextInt();
        int negative = 0;   //счетчик
        int positive = 0;   //счетчик
        String f = "Нулевое число не может быть отрицательным или положительным";

        // число A
        if (a < 0){
            negative++;
        }
        else if (a > 0){
            positive++;
        }
        else {
            String f1 = f;
            System.out.println(f);
        }


        //число B
        if (b < 0){
            negative++;
        }
        else if (b > 0){
            positive++;
        }
        else {
            String f1 = f;
            System.out.println(f);
        }


        //число C
        if (c < 0){
            negative++;
        }
        else if (c > 0){
            positive++;
        }
        else {
            String f1 = f;
            System.out.println(f);
        }

        System.out.println("Кол-во отрицательных чисел: "+negative);
        System.out.println("Кол-во положительных чисел: "+positive);






    }
}
