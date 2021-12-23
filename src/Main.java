/*
Создайте класс Player с параметрами:
-int number;
-String name;
-String surname;
-String position;
Getter/setter
+Player ()
+Player (int number, String name, String surname, String position)

Создайте класс Club с параметрами:
-String name;
-String country;
-int ratingPo99ints;
-int ratingPoints;
-Player [] players;
Getter/setter
+Club ()
+Club (String name, String country, int ratingPoints, Player [] players)
+void printClubData (); // Этот метод отображает информацию о клубе, включая список всех игроков, присутствующих в массиве.
В основном классе Main создайте 2 массива из игроков (в каждом из них по 5 игроков) и два клуба из разных клубов.
 */

public class Main{
    public static void main(String[] args) {
        Player player1 = new Player();
        player1.setNumber(30);
        player1.setName("Lionel");
        player1.setSurname("Messi");
        player1.setPosition("Right Winger");

        Player player2 = new Player(11, "Angel", "Di Maria", "Right Winger");
        Player player3 = new Player(7, "Kylian", "Mbappe", "Centre-Forward");
        Player player4 = new Player(9, "Mauro", "Icardi", "Centre-Forward");
        Player player5 = new Player(10, "Neymar", "Jr.", "Left Winger");
        Player player6 = new Player(12, "Rafinha", "Dos Santos", "Attaking Midfield");
        Player player7 = new Player(21, "Ander", "Herrera", "Central Midfield");
        Player player8 = new Player(18, "Georginio", "Wijnaldum", "Central Midfield");
        Player player9 = new Player(6, "Marco", "Verratti", "Central Midfield");
        Player player10 = new Player(27, "Idrissa", "Gueye", "Defensive Midfield");

        Player[] players = {player1, player2, player3, player4, player5};
        Player[] players1 = {player6, player7, player8, player9, player10};

        Club club = new Club();
        club.setName("PSG");
        club.setCountry("France");
        club.setRatingPoints(99);
        club.setPlayers(players);

        Club club1 = new Club("Real Madrid", "Spain", 98, players1);
        Club club2 = new Club("Chelsea", "England", 89, players);
        Club club3 = new Club("Juventus", "Italy", 91, players1);

        Club[] clubs = {club, club2, club2, club3};

//        for (int i=0; i< clubs.length; i++){
//            System.out.println(clubs[i].toString());
//            System.out.println();
//        }


        club.printClubData();
        System.out.println();
        club1.printClubData();
    }
}