import java.util.Scanner;

/*
3) Дана матрица размера M × N. Найти максимальный элемент
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер строки: ");
        int n = scan.nextInt();
        System.out.print("Введите размер столбца: ");
        int m = scan.nextInt();

        int[][] sc = new int[n][m];
        for (int i=0; i< sc.length; i++){
            for (int j=0; j<sc[i].length; j++){
                sc[i][j] = scan.nextInt();
            }
        }

        for (int i=0; i<sc.length; i++){
            for (int j=0; j<sc[i].length; j++){
                System.out.print(sc[i][j]+" ");
            }
            System.out.println();
        }



    }
}
