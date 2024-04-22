package Basic0123;

public class IngredientMain {
	public static void main(String[] args) throws InsufficientIngredientException, IngredientNotFoundException {
		Ingredient in1 = new Ingredient("당근", 3);
		PotionFactory pf = new PotionFactory(in1);
		in1.useIngredient(2);
		
		System.out.println(in1.quantity);

		pf.addIngredient("당근", 3);
		System.out.println(pf.getIngredients("당근"));
		pf.addIngredient("당근", 5);
		System.out.println(pf.getIngredients("당근"));
	
		pf.checkIngredientQuantity("오이");
		pf.restockIngredient("두리안", 4);
	
	
	
	
	}
}
