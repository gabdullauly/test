import java.util.Scanner;

public class Main{
    static int getFibonachi (int a){        //5
        if (a==1){
            return 0;
        }
        else if(a==2){
            return 1;
        }
        else {
            return getFibonachi(a-1)+getFibonachi(a-2);
        }
    }
//    static void getSumVoid (int a, int sum){
//        if (a==1){
//            System.out.print(1);
//        }
//        else {
//            sum =0;
//            getSumVoid(a-1, sum+a);
//        }
//        System.out.println(sum);
//    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = scan.nextInt();     //5
        System.out.println(getFibonachi(n));
//        int sum = 0;
//        getSumVoid(n, sum);
    }
}