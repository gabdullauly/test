import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scan.nextInt();
        int sum = 0;

//        for(int i=1; i<=n; i++){
//            sum = sum + (2*i-1);
//        }
//        System.out.print("Квадрат числа N: "+sum);

        int i=1;
        while (i<=n){
            sum = sum + (2*i-1);
            i++;
        }
        System.out.println("Квадрат числа N2: "+sum);


    }
}