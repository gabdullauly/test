import java.util.Scanner;

/*
2)	Дан массив A размера N. Сформировать новый массив B того же размера по следующему правилу:
элемент BK равен среднему арифметическому элементов массива A с номерами от K до N.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();         //7

        int[] mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = scan.nextInt();           //213 62 35 885 66 15 48
        }

        int ind = mass.length;
        int k;
        int[] mass2 = new int[n];
        for (int i = 0; i < mass.length; i++) {      //i[0]=213, i[1]=62
            for (int j = i + 1; j < mass.length; j++) {        //j[1]=62, 35, 885, 66, 15, 48
                k = mass[j];
                mass[i] = mass[i] + k;        //sum=213+62, sum = 213+62+35, sum= 213+62+35+885, sum=213+62+35+885+66, sum=213+62+35+885+66+15, sum 213+62+35+885+66+15+48=1324
                k++;
            }
            mass[i] = mass[i]/ind;
            mass2[i] = mass[i];
            ind = ind - 1;
            System.out.print(mass2[i]+" ");
        }
    }
}