/*
Создайте класс Ingredient, у которого есть параметры и методы:
- String name;
- double calories;
Constructors (default and parameterized)
Getters and Setters
+ String toString(); // Этот метод возвращает строку ингредиентов
Создайте класс Food, у которого есть параметры и методы:
- String name
- int price;
- Ingredient ingredients[];
Constructors (default and parameterized)
Getters and Setters
+ String toString(); // Этот метод возвращает String всех параметров
+ double getTotalCalories(); // Этот метод возвращает общее ккал всех ингрендиентов
Example: Food:
Manty, price: 500 KZT
_________
Ingredients:
Meat 400 kcal
 Onion 50 kcal
 Potato 20 kcal
Dough 200 kcal
_________
Total calories: 670 kcal
 */

public class Main{
    public static void main(String[] args) {
        Ingredient ingredient1 = new Ingredient();
        ingredient1.setName("Meat");
        ingredient1.setCalories(400);

        Ingredient ingredient2 = new Ingredient("Onion", 50);
        Ingredient ingredient3 = new Ingredient("Potato", 20);
        Ingredient ingredient4 = new Ingredient("Dough", 200);
        Ingredient ingredient5 = new Ingredient("Cheese", 100);

        Ingredient[] ingredients = {ingredient1, ingredient2, ingredient3, ingredient4, ingredient5};

        Food food1 = new Food();
        food1.setName("Manty");
        food1.setPrice(500);
        food1.setIngredients(ingredients);

        Food food2 = new Food("Burger", 600, ingredients);
        Food food3 = new Food("McDonalds", 1200, ingredients);
        Food food4 = new Food("Hardess", 1500, ingredients);

        Food[] foods = {food1, food2, food3, food4};


        for (int i=0; i< foods.length; i++){
            System.out.println("Food: "+foods[i].getName()+", "+"Price: "+foods[i].getPrice());
        }
//        System.out.println("Food: "+food1.getName());
//        System.out.println("Price: "+food1.getPrice());
        System.out.println("--------------------");
        System.out.println("Ingredients:");
        for (int i=0; i< ingredients.length; i++){
            System.out.println(ingredients[i].toString()+"kcal");
        }
        System.out.println("--------------------");
        for (int i=0; i< foods.length; i++){
            System.out.println("Total calories "+ foods[i].getName()+": "+foods[i].getTotalCalories());
        }
//        System.out.println("Total calories "+ food1.getName()+": "+food1.getTotalCalories());


    }
}

