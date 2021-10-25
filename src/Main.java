import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число К: ");
        int k = scan.nextInt();
        System.out.print("Введите число N: ");  //необходимо число К вывести в консоль N-раз
        int n = scan.nextInt();


        for ( int i=1; i<=n; i++){      //прописываю с 1 до N числа цикл выведения числа К
            System.out.print(k+" ");
        }






    }

}