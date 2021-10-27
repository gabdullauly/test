import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число А: ");
        int a = scan.nextInt();
        System.out.print("Введите число B: ");
        int b = scan.nextInt();
        System.out.print("Введите число C: ");
        int c = scan.nextInt();

        if ((a > b && a < c) || (a < b && a > c)){
            System.out.println(a);
        }
        else if ((b > a && b < c) || (b < a && b > c)){
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }


    }
}