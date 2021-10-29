import java.util.Scanner;

//Дано целое число N (> 0). Найти сумму 1N + 2N-1 + … + N1.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Число N: ");
        int n = scan.nextInt();
        double sum = 0;
        int k = n;

        //n = 4
        for (double i=1; i<=n; i++){    //1
            for (double j=k; j<=k; j++){    //4
                k--;
                sum = sum + Math.pow(i,j);
            }
        }
        System.out.println(sum);
    }
}