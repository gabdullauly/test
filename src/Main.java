import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scan.nextInt();
        boolean result = false;
        double a;



        //4423
        while (n>0){
            a = n%10;   //3, 2
            n = n/10;   //442, 44
            if (a==2){
                result = true;
                break;
            }
        }
        System.out.println("Содержание цифры 2 в числе N: "+result);


    }
}