import java.util.Scanner;

//5) Дан массив размеры N. Найти максимальное число всех элементов массива.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив N: "); //4
        int n = scan.nextInt();

        int[] mean = new int[n];
        for (int i=0; i<n; i++){
            mean[i] = scan.nextInt();   //15 3 20 44
        }
        int max = 0;
        for (int i=0; i<n; i++){
            if(mean[i]>max){
                mean[max] = mean[i];
            }
        }
        System.out.print("max: "+mean[max]);

    }
}