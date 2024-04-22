package OOP0115;

 interface Bbadda{
	public void hit();
}

public class AnonymousClass {
	Bbadda jm = new Bbadda() {
		
		@Override
		public void hit() {
			
		}
	};
}
