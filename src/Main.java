import java.util.Scanner;

/*
2) Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
При решении этой задачи нельзя использовать строки, списки, массивы и циклы. Разрешена только рекурсия и целочисленная арифметика.
 */


public class Main{
    static void printNum (int a, int b){
        if(b>0){
            int c = (int) (a / Math.pow(10, b));        //157/100 = 1
            a = a % (int) (Math.pow(10, b));              //157%100 = 57
            System.out.print(c + " ");
            b--;

            printNum(a, b);
        }
        else if (b==0){
            System.out.print(a);
        }
    }

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("n: ");    //157
        int n = scan.nextInt();

        int k = n;
        int q=0;
        while ((k/=10)>0){
            q++;
        }
        System.out.println(q);
        printNum(n, q);

    }
}