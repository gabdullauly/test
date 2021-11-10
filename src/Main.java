import java.util.Scanner;

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
    }
}