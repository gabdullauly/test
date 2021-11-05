import java.util.Scanner;

//Дан целочисленный массив A размера N. Переписать в новый цело- численный массив B все четные числа из исходного массива (в том же порядке) и вывести размер полученного массива B и его содержимое.


public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Размер массива А: "); //4
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i=0; i<n; i++) {
            a[i] = scan.nextInt();   //2 6 8 1
        }

        int k=0;    //счетчик
        for (int i=0; i<n; i++){
            if (a[i]%2==0){
                k++;
            }
        }

        System.out.print("Четные значения из массива А в массиве В: ");
        int[] b = new int[k];
        k=0;    //обратно задаем 0 чтобы был счетчиком
        for (int i=0; i<n; i++){
            if (a[i]%2==0){     //проверка на четность
                b[k]=a[i];      // записывает число в размер к
                System.out.print(b[k++]+" ");   //выводит последовательность четных чисел в индексе
            }

        }
        System.out.println();
        System.out.print("Размер массива В: "+k);

    }
}





