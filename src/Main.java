import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("x1: ");
        double x1 = scan.nextDouble();
        System.out.print("y1: ");
        double y1 = scan.nextDouble();
        System.out.print("x2: ");
        double x2 = scan.nextDouble();
        System.out.print("y2: ");
        double y2 = scan.nextDouble();

        System.out.print("Расстояние: ");
        System.out.println(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2)));





    }
}
