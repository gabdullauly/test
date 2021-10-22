import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите четрыхзначное число: ");
        int a = scan.nextInt();
        int b = (a/1000);       //первая цифра 4-х значного числа
        int c = ((a/100)%10);   //вторая цифра 4-х значного числа
        int d = ((a/10)%10);         //третья цифра 4-х значного числа
        int e = (a%10);         //четвертая цифра 4-х значного числа

        boolean f = (a > 999 && a < 10000);
        System.out.println("4-х значное число: "+f);

        boolean g = ((b==c && b==d && b==e) || (b==e && c==d));
        System.out.println("Проверка на читаемость L>R & L<R: "+g); //проверка на читаемость 4-х значного числа слева на право и справа на лево


    }
}
