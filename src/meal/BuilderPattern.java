package meal;

public class BuilderPattern {

	public static void main(String[] args) {
		MealBuilder mealBuilder = new MealBuilder();
		
		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("Veg Meal *************************");
		vegMeal.showItems();
		System.out.println("Total Coast : " + vegMeal.getCost());
		
		Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
		System.out.println("Non Veg Meal *********************");
		nonVegMeal.showItems();
		System.out.println("Total Coast : " + nonVegMeal.getCost());
		
		Meal combo = mealBuilder.prepareCombo1();
		System.out.println("Combo 1 ***************************");
		combo.showItems();
		System.out.println("Total Cost : " + combo.getCost());

	}

}
