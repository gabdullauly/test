import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число А: ");
        double a= scan.nextDouble();
        System.out.print("Введите число B: ");
        double b= scan.nextDouble();
        System.out.print("Выберите действие от 1 до 4: ");
        int c= scan.nextInt();


        switch (c){
            case 1:
                System.out.print("Сложение: ");
                System.out.println(a+b);
                    break;
            case 2:
                System.out.print("Вычитание: ");
                System.out.println(a-b);
                    break;
            case 3:
                System.out.print("Умножение: ");
                System.out.println(a*b);
                    break;
            case 4:
                System.out.print("Деление: ");
                System.out.println(a/b);
                    break;
            default: System.out.println("Ошибка");
        }



    }
}
