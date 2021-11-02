import java.util.Scanner;

//Дано целое число N (> 0). Найти сумму 1N + 2N-1 + … + N1.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив N: "); //5
        int n = scan.nextInt();

        int [] meaning = new int[n];
        for (int i=0; i<n; i++){
            meaning[i] = scan.nextInt(); //4 6 8 9 15
        }

        //ср.арифмет
        double sum = 0;
        for (int i=0; i<n; i++){
            sum = sum + meaning[i];
        }
        System.out.print("Среднее арифметическое: "+(sum/n));   //ср.ар. должно быть 8,4


    }
}