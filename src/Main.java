import java.util.Scanner;

/*
1)	Дан массив размера N. Найти два соседних элемента, сумма которых максимальна,
и вывести эти элементы в порядке возрастания их значений, и вывести сумму значений.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();     //7

        int[] mass1 = new int[n];
        for (int i=0; i<mass1.length; i++){
            mass1[i] = scan.nextInt();          //21 6561 1663 13 7661 564 312
        }

        int max = Integer.MIN_VALUE;
        int ind0 = 0;
        int ind1 = 0;
        for (int i=0; i<mass1.length-1; i++){
            if (mass1[i]+mass1[i+1]>max){
                    max = mass1[i]+mass1[i+1];
                    ind0 = mass1[i];
                    ind1 = mass1[i+1];
            }
        }

        int[] mass2 = {ind0, ind1};
        if (mass2[0]>mass2[1]){
            System.out.print(mass2[1]+" "+mass2[0]);
        }
        else {
            System.out.print(mass2[0]+" "+mass2[1]);
        }
        System.out.println();
        System.out.print(ind0+ind1);
    }
}

