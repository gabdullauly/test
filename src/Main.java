import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Катет А: ");
        double a = scan.nextDouble();
        System.out.print("Катет B: ");
        double b = scan.nextDouble();

        double g = (Math.sqrt(Math.pow(a,2)+Math.pow(b,2)));
        System.out.println("Гипотенуза: "+g);
        double P = (a+b+g);
        System.out.println("Периметр: "+P);


    }
}
