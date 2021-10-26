import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scan.nextInt();

        int k = n/3;
        k++;
        System.out.println("Наименьшее число К, при котором 3К>N: "+k);






    }

}