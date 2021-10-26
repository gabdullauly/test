import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число A: ");
        long a = scan.nextLong();
        System.out.print("Введите число N: ");
        byte n = scan.nextByte();


        double A = Math.pow(a,n);
        System.out.println("Число А в степени N: "+A);






    }

}