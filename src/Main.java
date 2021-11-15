import java.util.Scanner;

/*
6) Ввести размер массива N. Через консоль прочитать каждый элемент масива.
Вывести элемент с максимальным количеством одинаковых элементов и его количество
 */

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = scan.nextInt();         //20

        int[] sc = new int[n];
        for (int i=0; i<sc.length; i++){
            sc[i] = scan.nextInt();            //1 1 4 0 3 9 8 3 3 3 8 5 4 3 3 3 85 3 2 2
        }

        int count = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<sc.length; i++){
            int k=1;
            for (int j=i+1; j<sc.length; j++){
                if (sc[i]==sc[j]){
                    k++;
                }
            }
            if(k>max){
                max = k;
                count = sc[i];
            }
        }
        System.out.print("Кол-во макс одинакового элемента: "+max);
        System.out.println();
        System.out.print("Элемент: "+count);

    }
}

