import java.util.Scanner;

//Дано целое число N (> 0). Найти сумму 1N + 2N-1 + … + N1.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Число А: ");
        int a = scan.nextInt();
        System.out.print("Число B: ");
        int b = scan.nextInt();

        //A = 2
        //B = 5
        for (int i=a; i<=b; i++){    //2
            for (int j=a; j<=i; j++){    //4
                System.out.print(i+" ");
            }
            System.out.println();
        }




    }
}