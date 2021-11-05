import java.util.Scanner;

//4) Дан целочисленный массив размера N. Вывести вначале все содержащиеся в данном массиве четные числа в порядке
// возрастания их индексов, а затем — все нечетные числа в порядке убывания их индексов.


public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив размера N: "); //7
        int n = scan.nextInt();

        int[] mean = new int[n];
        for (int i=0; i<n; i++){
            mean[i] = scan.nextInt();       //13 26 8 1 10 5 6
        }
        System.out.print("Четные числа в порядке возрастания их индексов: ");
        for (int i=0; i<n; i++){
            if (mean[i]%2==0){
                System.out.print(i+":"+mean[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Нечетные числа в порядке убывания их индексов: ");
        for (int i=n-1; i>=0; i--){
            if(mean[i]%2!=0){
                System.out.print(i+":"+mean[i]+" ");
            }
        }
    }
}