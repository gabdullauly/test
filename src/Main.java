import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите единицу измерения от 1 до 5: ");
        int UnitMeas = scan.nextInt();
        System.out.print("Введите значение для массы: ");
        float m = scan.nextFloat();


        switch (UnitMeas){
            case 1:
                System.out.print("Выбрана единица измерения КИЛОГРАММ, введите значение массы:");
                System.out.println(m);
                break;
            case 2:
                System.out.print("Выбрана единица измерения МИЛЛИГРАММ, введите значение массы:");
                System.out.print(m/1000000);
                break;
            case 3:
                System.out.print("Выбрана единица измерения ГРАММ, введите значение массы:");
                System.out.println(m/1000);
                break;
            case 4:
                System.out.print("Выбрана единица измерения ЦЕНТНЕР, введите значение массы:");
                System.out.println(m*100);
                break;
            case 5:
                System.out.print("Выбрана единица измерения ТОННА, введите значение массы:");
                System.out.println(m*1000);
                break;
            default:
                System.out.println("Ошибка");
                return;
        }

        System.out.println(" килограмм");
    }

}