package CollectionAndGeneric;

public class ProductMain {
	
	public static void main(String[] args) {
		Product<TV, String> pl = new Product<TV, String>();
		pl.setT(new TV(2024, 1));
		pl.setM("군침안도네");
	
	
		Product<Car, String> p2 = new Product<Car, String>();
		p2.setT(new Car("포르쉐",2023, 12));
		p2.setM("파나메나");
		System.out.println(p2.getT().getYear());
		System.out.println(p2.getT().getMonth());
		
	}
}
