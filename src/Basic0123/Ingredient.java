package Basic0123;

import java.util.HashMap;
import java.util.Map;


public class Ingredient {
	protected String name; //(재료의 이름을 나타내는 문자열)
	protected int quantity; //(재료의 수량을 나타내는 정수)
	
	Ingredient(String name, int quantity){
		this.name =name;
		this.quantity = quantity;
	}
	//재료를 사용하는 메서드. 
	//이 메서드는 주어진 양만큼 재료의 수량을 감소시킵니다. 만약 재료의 수량이 부족한 경우 
	//InsufficientIngredientException을 발생시킵니다.
	public void useIngredient(int amount) throws InsufficientIngredientException{
		if(amount > this.quantity) {
			throw new InsufficientIngredientException("재료 부족");
			}
			else if(amount <= this.quantity) {
				this.quantity -= amount;
			}
	}
}


//포션 제조소
class PotionFactory{
	Map<String, Integer> ingredients = new HashMap<String, Integer>(); 
	
	PotionFactory(Ingredient li){
		this.ingredients.put(li.name, li.quantity);
	}
	//: 재료의 이름과 수량을 입력받아 ingredients 맵에 추가하는 메서드.
	void addIngredient(String name, int quantity) {
		ingredients.put(name, quantity);
	}
	
	//수량 가져오기
	public Integer getIngredients(String str) {
		return ingredients.get(str);
	}
	public void setIngredients(Map<String, Integer> ingredients) {
		this.ingredients = ingredients;
	}
	
	
	//: 주어진 재료와 수량에 따라 포션을 제조하는 메서드. 
	// 재료의 수량이 부족한 경우 InsufficientIngredientException을 발생시킵니다.
	void makePotion(String ingredientName, int amount) throws InsufficientIngredientException{
		int mergy = ingredients.get(ingredientName);
		try {
			if(mergy < amount) {
				InsufficientIngredientException e = new InsufficientIngredientException("재료부족");
				throw e;
			}
			
			else if(mergy >= amount) {
				mergy -= amount;
				ingredients.put(ingredientName, mergy);
				
			}
		} catch (InsufficientIngredientException e) {
			System.out.println("재료가 부족해용");
		}
	}
	
	
	//: 주어진 재료의 수량을 확인하는 메서드입니다. 
//	재료가 존재하지 않는 경우 IngredientNotFoundException을 발생시킵니다.
	void checkIngredientQuantity(String ingredientName) throws IngredientNotFoundException {
		try {
			if(ingredients.get(ingredientName) == null) {
				IngredientNotFoundException e = new IngredientNotFoundException();
				throw e;
			}
			else if(ingredients.get(ingredientName) != null) {
				this.ingredients.keySet();
				this.ingredients.get(ingredientName);
			}
		} catch (IngredientNotFoundException e) {
			System.out.println("재료가 없서용");
		}
	}	
	//: 주어진 재료의 수량을 추가하는 메서드입니다. 
//	재료가 존재하지 않는 경우 IngredientNotFoundException을 발생시킵니다
	void restockIngredient(String ingredientName, int quantity) throws IngredientNotFoundException{
		try {
			
			if (this.ingredients.equals(ingredientName)) {
				int mergy = ingredients.get(ingredientName);
				mergy += quantity;
				ingredients.put(ingredientName, mergy);
			}
			else if(!this.ingredients.equals(ingredientName)) {
				IngredientNotFoundException e = new IngredientNotFoundException();
				throw e;
			}
		} catch (IngredientNotFoundException e) {
			System.out.println("재료가 존재하지 않아요");
			// TODO: handle exception
		}
	}
}