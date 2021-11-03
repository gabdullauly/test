import java.util.Scanner;

//1) Дан массив A размера N. Найти максимальный элемент из его элементов с нечетными номерами: A1, A3, A5, . . . .

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив А: "); //4
        int n = scan.nextInt();

        int[] mean = new int[n];
        for (int i=0; i<n; i++){
            mean[i] = scan.nextInt();   //3 5 6 7
        }
        System.out.print("Нечетные номера: ");
        for (int i=0; i<n; i++){
            if (mean[i]%2!=0){
                System.out.print(mean[i]+" ");
            }
        }
    }
}

