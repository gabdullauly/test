import java.util.Scanner;

//1) Дан массив A размера N. Найти максимальный элемент из его элементов с нечетными номерами: A1, A3, A5, . . . .


public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите кол-во попыток для отгадывания рандомного числа: ");  //3
        int a = scan.nextInt();

        int rand = (int)(Math.random()*30+1);


        for (int i=1; i<=a; i++){
            System.out.print("Введите число от 1 до 30: ");
            int b = scan.nextInt();
            if (b==rand){
                System.out.println("Бинго");
                return;
                }
                else if (b<rand){
                System.out.println("Подсказка: нужно больше");
                }
                else if (b>rand){
                System.out.println("Подсказка: нужно меньше");
                }
                else {
                System.out.println("Ошибка");
            }
        }
        System.out.println(rand);



    }
}





