import java.util.Scanner;

//2) Дано целое число N (>2). Сформировать и вывести целочисленный массив размера N,
// содержащий N первых элементов последовательности чисел Фибоначчи FK:  F1 =1, F2 =1, FK =FK−2 +FK−1, K =3,4,....


public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N>2: ");
        int n = scan.nextInt(); //6

        int[] mean = new int[n];    //???
        for(int i=2; i<n; i++){
            mean[0] = 0;
            mean[1] = 1;
            mean[i] = mean[i-2] + mean[i-1];    //0 1 1 2 3 5
            System.out.println(mean[i]);
        }



    }
}