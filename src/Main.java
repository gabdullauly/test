import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число A: ");
        int a= scan.nextInt();
        System.out.print("Введите число N: ");
        int n= scan.nextInt();
        double sum=0;

        for(double i=0; i<=n; i++){
            sum=sum+Math.pow(a,i);
        }
        System.out.println(sum);
    }
}