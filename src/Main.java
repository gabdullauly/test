import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Число A: ");
        double a = scan.nextDouble();
        System.out.print("Число B: ");
        double b = scan.nextDouble();

        double c = (a+b);
        System.out.println("Сумма: "+Math.abs(c));
        double d = (a-b);
        System.out.println("Разность: "+Math.abs(d));
        double e = (a*b);
        System.out.println("Произведение: "+Math.abs(e));
        double f = (a/b);
        System.out.println("Частное: "+Math.abs(f));



    }
}
