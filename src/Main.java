import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите число N: ");
        int n = scan.nextInt();
        int a;
        boolean result = false;


        //54312
        while (n > 0) {               //54312
            a = n % 10;               //2, 1
            n = n / 10;               //5431,
            if (a % 2 != 0) {
                result = true;      //false
                break;
            }
        }
        System.out.println(result);
    }
}



//        Scanner scan = new Scanner(System.in);
//        System.out.print("введите число N: ");
//        int n = scan.nextInt();
//        int a=0;    //счетчик
//        int sum=0;  //сумма чисел
//        boolean b = true;
//
//
//        //1234
//        while (n>0){  //для цикла необходимо обозначить границу что введенное число должно быть больше 0
//            sum = sum+n%10;   //0+4, 4+3, 7+2, 9+1
//            n = n/10; //123, 12, 1, 0
//            a++;1+1+1+1
//        }
//        b = (sum%2)==0;
//        System.out.println("кол-во цифр: "+a);
//        System.out.println("сумма чисел: "+sum);
//        System.out.print("четность суммы чисел; "+b);




