import java.util.Scanner;

/*
<<<<<<< HEAD
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
=======
Напишите метод, который принимает в качестве аргумента некоторую строку и возвращает строку без гласных в ней.
 */

public class Main {
    static String StringWithoutVowels (String a){
        String s = "";
        for (int i=0; i<a.length(); i++){
            if(a.charAt(i)!='a' && a.charAt(i)!='e' && a.charAt(i)!='y' && a.charAt(i)!='u' && a.charAt(i)!='i'
                    && a.charAt(i)!='o' && a.charAt(i)!='w'){
                s = s+a.charAt(i);
            }
        }
        return s;
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово: ");        //Samsung*Digital*OnePlus*iPhone
        String n = scan.next();
>>>>>>> 1674b9eb8cee4e7d63e41faa15822cf2c1be51e4

        System.out.println(StringWithoutVowels(n));
    }
}
