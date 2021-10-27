import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scan.nextInt();
        System.out.print("Введите число K: ");
        int k = scan.nextInt();
        double sum = 0;

        for (int i=1; i<=n; i++){
            sum = sum +Math.pow(i,k);
        }
        System.out.println("Сумма: "+sum);


    }
}