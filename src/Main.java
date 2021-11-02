import java.util.Scanner;

//4) Дан массив размера N. Поменять местами его минимальный и максимальный элементы.

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Массив N: "); //7
        int n = scan.nextInt();

        int[] mean = new int[n];
        for (int i=0; i<n; i++){
            mean[i] = scan.nextInt();    // 2 45 9 6 12 3 84
        }

        int max = -2147483647;
        int min = 2147483647;
        for (int i=0; i<n; i++){
            if (mean[i]>max){
                max = i;        //находим наибольший элемент и запишем его индекс
            }
            if (mean[i]<min){
                min = i;        //находим наименьший элемент и запишем его индекс
            }
        }

//        System.out.println("max: "+mean[max]);
//        System.out.println("min: "+mean[min]);
        if(mean[max]!=mean[min]){
            mean[max] = mean[max] + mean[min];      //84+2
            mean[min] = mean[max] - mean[min];      //меняем местами то есть 86-2=84 - это mean[min]
            mean[max] = mean[max] - mean[min];      //86-84=2 - это mean[max]
        }
//        System.out.println("max: "+mean[max]);
//        System.out.println("min: "+mean[min]);

        for (int i=0; i<n; i++){
            System.out.print(mean[i]+" ");
        }


    }
}