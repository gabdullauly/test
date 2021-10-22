import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите единицу измерения от 1 до 5: ");
        int UnitMeas = scan.nextInt();
        float m;


        switch (UnitMeas){
            case 1:
                System.out.print("Выбрана единица измерения КИЛОГРАММ, введите значение массы: ");
                m = scan.nextFloat();
                System.out.println(m+" килограмм");
                break;
            case 2:
                System.out.print("Выбрана единица измерения МИЛЛИГРАММ, введите значение массы: ");
                m = scan.nextFloat();
                System.out.print(m/1000000);
                System.out.println(" килограмм");
                break;
            case 3:
                System.out.print("Выбрана единица измерения ГРАММ, введите значение массы: ");
                m = scan.nextFloat();
                System.out.println(m/1000);
                System.out.println(" килограмм");
                break;
            case 4:
                System.out.print("Выбрана единица измерения ЦЕНТНЕР, введите значение массы: ");
                m = scan.nextFloat();
                System.out.println(m*100);
                System.out.println(" килограмм");
                break;
            case 5:
                System.out.print("Выбрана единица измерения ТОННА, введите значение массы: ");
                m = scan.nextFloat();
                System.out.println(m*1000);
                System.out.println(" килограмм");
                break;
            default:
                System.out.println("Ошибка");
        }


    }
}
