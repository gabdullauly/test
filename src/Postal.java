import java.util.Scanner;

public class Postal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = scan.nextInt(); //7
        int[] meaning = new int [n];
        for (int i=0; i<n; i++){
            meaning[i] = scan.nextInt();
        }
        //78 5 4 15 6 99 1
        for (int i=0; i<n; i++){
            System.out.print(meaning[n-i-1]+" ");
        }
//        //альтернативное решение2
//        for (int i=n-1; i>=0; i--){
//            System.out.print(meaning[i]+" ");
//        }
//        //альтернативное решение3
//        n=n-1;
//        for (int i=n; i>=0; i--){
//            System.out.print(meaning[i]+" ");
//        }
    }
}
