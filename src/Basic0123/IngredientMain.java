package Basic0123;

public class IngredientMain {
	public static void main(String[] args) throws InsufficientIngredientException, IngredientNotFoundException {
		Ingredient in1 = new Ingredient("���", 3);
		PotionFactory pf = new PotionFactory(in1);
		in1.useIngredient(2);
		
		System.out.println(in1.quantity);

		pf.addIngredient("���", 3);
		System.out.println(pf.getIngredients("���"));
		pf.addIngredient("���", 5);
		System.out.println(pf.getIngredients("���"));
	
		pf.checkIngredientQuantity("����");
		pf.restockIngredient("�θ���", 4);
	
	
	
	
	}
}
