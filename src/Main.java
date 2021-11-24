import java.util.Scanner;

/*
Напишите метод, который принимает в качестве аргумента некоторую строку и возвращает строку без гласных в ней.
 */

public class Main {
    static String StringWithoutVowels (String a){
        String s = "";
        for (int i=0; i<a.length(); i++){
            if(a.charAt(i)!='a' && a.charAt(i)!='e' && a.charAt(i)!='y' && a.charAt(i)!='u' && a.charAt(i)!='i'
                    && a.charAt(i)!='o' && a.charAt(i)!='w'){
                s = s+a.charAt(i);
            }
        }
        return s;
    }
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите слово: ");        //Samsung*Digital*OnePlus*iPhone
        String n = scan.next();

        System.out.println(StringWithoutVowels(n));
    }
}
