/*
3) Создайте класс Player с параметрами:
int number;
String name;
String surname;
String position;
Player ()
Player (int number, String name, String surname, String position)
String getData();
Создать 10 экземпляров, отсортировать по его Number, вывести Игроков с четным индексом в массиве
 */

public class Main {
    static void getSortByNumber (Player[] arr){
        for (int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j].number>arr[j+1].number){
                    Player temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i].getData()+" "+i);
        }
        System.out.println();
    }

    public static void main (String[] args) {
        Player player1 = new Player();
        player1.number = 30;
        player1.name = "Lionel";
        player1.surname = "Messi";
        player1.position = "Right Winger";

        Player player2 = new Player(11, "Angel", "Di Maria", "Right Winger");
        Player player3 = new Player(7, "Kylian", "Mbappe", "Centre-Forward");
        Player player4 = new Player(9, "Mauro", "Icardi", "Centre-Forward");
        Player player5 = new Player(10, "Neymar", "Jr.", "Left Winger");
        Player player6 = new Player(12, "Rafinha", "Dos Santos", "Attaking Midfield");
        Player player7 = new Player(21, "Ander", "Herrera", "Central Midfield");
        Player player8 = new Player(18, "Georginio", "Wijnaldum", "Central Midfield");
        Player player9 = new Player(6, "Marco", "Verratti", "Central Midfield");
        Player player10 = new Player(27, "Idrissa", "Gueye", "Defensive Midfield");

        Player[] players = {player1, player2, player3, player4, player5, player6, player7, player8, player9, player10};
        for (int i=0; i<players.length; i++){
            System.out.println(players[i].getData()+" "+i);
        }

        System.out.println("+++++++++++++++++++++++++++++++++");
        getSortByNumber(players);
        for (int i=0; i< players.length; i++){
            if (i%2==0){
            System.out.println(players[i].getData()+" "+i);
            }
        }
    }
}