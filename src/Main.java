import java.util.Scanner;

/*
5) Ввести размер массива N. Через консоль прочитать каждый элемент масива.
Отсортировать его и добавить все его нечетные числа в новый массив в отсортированном виде.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();         //7

        int[] a = new int[n];
        for (int i=0; i<a.length; i++){
            a[i] = scan.nextInt();          //16 213 51 84 9 6 22
        }

        for (int i=0; i< a.length-1; i++){
            for (int j=0; j< a.length-i-1; j++){
                if (a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for (int i=0; i< a.length; i++){
            System.out.print(a[i]+" ");         //6 9 16 22 51 84 213
        }

        System.out.println();

        int k=0;
        for (int i=0; i< a.length; i++){
            if (a[i]%2!=0){                     //находим кол-во индексов с нечетными значениями
                k++;
            }
        }                   //3

        int[] b = new int[k];
        k=0;
        for (int i=0; i< a.length; i++){
            if (a[i]%2!=0){
                b[k] = a[i];            //присваиваем к индексам нечетные значения
                k = k+1;
            }
        }

        for (int i=0; i<b.length; i++){
            System.out.print(b[i]+" ");         //9 51 213
        }
    }
}

