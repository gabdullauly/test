import java.util.Scanner;

//Дан массив A размера N. Вывести вначале его элементы с четными номерами (в порядке возрастания номеров),
// а затем — элементы с нечетными номерами (также в порядке возрастания номеров): A2, A4, A6, ..., A1, A3, A5, ....
// Условный оператор не использовать.


public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив А: "); //5
        int n = scan.nextInt();

        int[] mean = new int[n];
        for (int i=0; i<n; i++){
            mean[i] = scan.nextInt();// 4(0), 15(1), 10(2), 2(3), 22(4)
        }

        System.out.print("Элементы четных индексов в порядке возрастания: ");
        for (int i=0; i<n; i+=2){
            System.out.print(mean[i]+" ");  //4 10 22
        }
        System.out.println();
        System.out.print("Элементы нечетных индексов в порядке возрастания: ");
        for (int i=1; i<n; i+=2){
            System.out.print(mean[i]+" ");  //15 2
        }
    }
}

