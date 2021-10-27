import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scan.nextInt();
        double a = 1;
        double b;
        double c;

        for (int i=1; i<=n; i++){
            b = 0.1*i;
            c = 1+b;
            a = a*c;
        }
        System.out.println(a);
    }
}