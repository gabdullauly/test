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



public class Ingredient {
    private String name;
    private  double calories;

    public Ingredient(){}

    public Ingredient(String name, double calories){
        this.name = name;
        this.calories = calories;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCalories (double calories){
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public String toString (){
        return name+" "+calories;
    }
}
