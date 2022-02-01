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


public class Food {
    private String name;
    private int price;
    private Ingredient[] ingredients;

    public Food(){}

    public Food (String name, int price, Ingredient[] ingredients){
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setIngredients(Ingredient[] ingredients){
        this.ingredients = ingredients;
    }

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public Ingredient[] getIngredients(){
        return ingredients;
    }

    public String toString (){
        String all = "";
        all = all+name+" "+price+"\n";
        for (int i=0; i<ingredients.length; i++){
            all = all+ingredients[i].getName()+" "+ingredients[i].getCalories()+"\n";
        }
        return all;
    }

    public double getTotalCalories(){
        double sum = 0;
        for (int i=0; i< ingredients.length; i++){
            sum = sum+ingredients[i].getCalories();
        }
        return sum;
    }
}
