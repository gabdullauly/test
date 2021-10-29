import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Число А: ");
//        int a = scan.nextInt();
//        System.out.print("Число B: ");
//        int b = scan.nextInt();

        int a = 7;
        int b = 2;
        //A = 7
        //B = 2
        for (int i=a; i>=b; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=a-1; i>=b; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=a-2; i>=b; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=a-3; i>=b; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=a-4; i>=b; i--){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=a-5; i>=b; i--){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}