package builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("prepare NonVegMeal");
        nonVegMeal.showItems();
        System.out.println(" NonVegMeal cost:" + nonVegMeal.getCost());

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("prepare VegMeal");
        vegMeal.showItems();
        System.out.println("VegMeal cost:" + vegMeal.getCost());
    }
}
