import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scan.nextInt();

        double sum=0;

        for (double i=1; i<=n; i++){
        sum=sum+1/i;
            System.out.print(i+" ");

        }
        System.out.println();
        System.out.print("Сумма последовательных чисел N-го числа: "+sum);





    }

}