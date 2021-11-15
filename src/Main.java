import java.util.Scanner;

/*
1)	Дан массив размера N. Найти два соседних элемента, сумма которых максимальна,
и вывести эти элементы в порядке возрастания их индексов.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();     //7

        int[] mass1 = new int[n];
        for (int i=0; i<mass1.length; i++){
            mass1[i] = scan.nextInt();          //21 6561 621 13 7661 564 312
        }

        int max = Integer.MIN_VALUE;
        int ind0 = 0;
        int ind1 = 0;
        for (int i=0; i<mass1.length; i++){
            for (int j=i+1; j<mass1.length; j++){
                if (mass1[i]+mass1[i+1]>max){
                    max = mass1[i]+mass1[i+1];
                    ind0 = mass1[i];
                    ind1 = mass1[i+1];
                }
            }
        }

        int[] mass2 = {ind0, ind1};
        for (int i=0; i<mass2.length-1; i++){
            for (int j=0; j<mass2.length-i-1; i++){
                if(mass2[j]>mass2[j+1]){
                    int temp = mass2[j];
                    mass2[j] = mass2[j+1];
                    mass2[j+1] = temp;
                }
            }
        }
        for (int i=0; i<mass2.length; i++){
            System.out.print(mass2[i]+" ");
        }
        System.out.println();
        System.out.print(ind0+ind1);
    }
}

