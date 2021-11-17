import java.util.Scanner;

/*
3) Даны два массива A и B размера 5, элементы которых упорядочены по возрастанию.
Объединить эти массивы так, чтобы результирующий массив C (размера 10) остался упорядоченным по возрастанию.
( PS: В конце используете сортировку)
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] massA = new int[5];
        int[] massB = new int[5];

        for (int i=0; i<massA.length; i++){
            massA[i] = scan.nextInt();          //2 13 6 45 9
        }
        for (int i=0; i<massB.length; i++){
            massB[i] = scan.nextInt();          //25 1 3 12 77
        }

        int[] massC = new int[10];
        for (int i=0; i<massC.length-5; i++){
            massC[i] = massA[i];
        }
        int k = 0;
        for (int i=5; i<massC.length; i++){
            massC[i] = massB[k];
            k = k+1;
        }

        for (int i=0; i<massC.length; i++){
            System.out.print(massC[i]+" ");
        }

        System.out.println();
        for (int i=0; i<massC.length-1; i++){
            for (int j=0; j< massC.length-i-1; j++){
                if (massC[j]>massC[j+1]){
                    int temp = massC[j];
                    massC[j] = massC[j+1];
                    massC[j+1] = temp;
                }
            }
        }

        for (int i=0; i<massC.length; i++){
            System.out.print(massC[i]+" ");
        }
    }
}

