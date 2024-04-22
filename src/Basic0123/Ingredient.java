package Basic0123;

import java.util.HashMap;
import java.util.Map;


public class Ingredient {
	protected String name; //(����� �̸��� ��Ÿ���� ���ڿ�)
	protected int quantity; //(����� ������ ��Ÿ���� ����)
	
	Ingredient(String name, int quantity){
		this.name =name;
		this.quantity = quantity;
	}
	//��Ḧ ����ϴ� �޼���. 
	//�� �޼���� �־��� �縸ŭ ����� ������ ���ҽ�ŵ�ϴ�. ���� ����� ������ ������ ��� 
	//InsufficientIngredientException�� �߻���ŵ�ϴ�.
	public void useIngredient(int amount) throws InsufficientIngredientException{
		if(amount > this.quantity) {
			throw new InsufficientIngredientException("��� ����");
			}
			else if(amount <= this.quantity) {
				this.quantity -= amount;
			}
	}
}


//���� ������
class PotionFactory{
	Map<String, Integer> ingredients = new HashMap<String, Integer>(); 
	
	PotionFactory(Ingredient li){
		this.ingredients.put(li.name, li.quantity);
	}
	//: ����� �̸��� ������ �Է¹޾� ingredients �ʿ� �߰��ϴ� �޼���.
	void addIngredient(String name, int quantity) {
		ingredients.put(name, quantity);
	}
	
	//���� ��������
	public Integer getIngredients(String str) {
		return ingredients.get(str);
	}
	public void setIngredients(Map<String, Integer> ingredients) {
		this.ingredients = ingredients;
	}
	
	
	//: �־��� ���� ������ ���� ������ �����ϴ� �޼���. 
	// ����� ������ ������ ��� InsufficientIngredientException�� �߻���ŵ�ϴ�.
	void makePotion(String ingredientName, int amount) throws InsufficientIngredientException{
		int mergy = ingredients.get(ingredientName);
		try {
			if(mergy < amount) {
				InsufficientIngredientException e = new InsufficientIngredientException("������");
				throw e;
			}
			
			else if(mergy >= amount) {
				mergy -= amount;
				ingredients.put(ingredientName, mergy);
				
			}
		} catch (InsufficientIngredientException e) {
			System.out.println("��ᰡ �����ؿ�");
		}
	}
	
	
	//: �־��� ����� ������ Ȯ���ϴ� �޼����Դϴ�. 
//	��ᰡ �������� �ʴ� ��� IngredientNotFoundException�� �߻���ŵ�ϴ�.
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
			System.out.println("��ᰡ ������");
		}
	}	
	//: �־��� ����� ������ �߰��ϴ� �޼����Դϴ�. 
//	��ᰡ �������� �ʴ� ��� IngredientNotFoundException�� �߻���ŵ�ϴ�
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
			System.out.println("��ᰡ �������� �ʾƿ�");
			// TODO: handle exception
		}
	}
}