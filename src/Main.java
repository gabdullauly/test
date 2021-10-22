import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Число А: ");
        double a = scan.nextDouble();
        System.out.print("Число B: ");
        double b = scan.nextDouble();
        System.out.print("Число С: ");
        double c = scan.nextDouble();


        System.out.print("Min: ");
        if (a<b && a<c){
            System.out.println(a);
        }
        else if (b<a && b<c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }

        System.out.print("Max: ");
        if (a>b && a>c){
            System.out.println(a);
        }
        else if (b>a && b>c){
            System.out.println(b);
        }
        else{
            System.out.println(c);
        }


    }
}
