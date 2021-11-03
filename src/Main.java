import java.util.Scanner;

//6) Дан массив A размера N (N — нечетное число). Вывести его элементы с нечетными номерами в порядке убывания номеров:
// AN, AN−2, AN−4, ..., A1. Условный оператор не использовать.


public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив А: "); //4
        int n = scan.nextInt();

        int [] mean = new int[n];
        for (int i=0; i<n; i++){
            mean[i] = scan.nextInt();   //2 6 66 77
        }


        for(int i=n-1; i>=0; i--){  //4-1=3 - "77", 2-1=1 - "6"
            System.out.print(mean[i]+" ");  //выводит 77, 6
            i=i-1;  //3-1=2 - "66" - но сверху еще раз минусует на 1
        }
    }
}

