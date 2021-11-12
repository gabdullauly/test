import java.util.Scanner;

<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt(); //7

        int[] sc = new int[n];
        for(int i=0; i<n; i++){
            sc[i] = scan.nextInt();    //3 16 5 99 15 32 0
        }
        for (int i=0; i<n-1; i++){
            for (int j=0; j<n-i-1; j++){
                if (sc[j]<sc[j+1]){
                    int temp = sc[j];
                    sc[j] = sc[j+1];
                    sc[j+1] = temp;
                }
            }
        }
        for (int i=0; i<n; i++){
            System.out.print(sc[i]+" ");
        }
=======
/*
2) Ввести размер массива N. Через консоль прочитать каждый элемент масива.
Вывести четные числа
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");   //7
        int n = scan.nextInt();

        int[] sc = new int[n];
        for (int i = 0; i < n; i++) {
            sc[i] = scan.nextInt();     //16 213 51 84 9 6 22
            System.out.print(sc[i] + " ");
        }
        System.out.println();
        System.out.print("Четные числа: ");
        for (int i=0; i<n; i++) {
            if(sc[i]%2==0){
                System.out.print(sc[i]+" ");
            }
        }
>>>>>>> ee7bada7c9aaefe8a04cec69db3e3487c640d085
    }
}
