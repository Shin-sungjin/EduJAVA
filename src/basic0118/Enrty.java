package basic0118;

public class Enrty {

		String word;
		
		//���
//		public void Enrty() {
//			System.out.println("***������***");
//			
//			
//		}
//		
//		public void Enrty(String w) {
//
//			this.word = w;
//			Enrty();
//		}
		
		//������ �����ε�
		Enrty(){
			System.out.println("***������***");
			writeView();
		}
		
		Enrty(String w){
			this.word = w;
			new Enrty();
		}		
		
		public void writeView() {
			System.out.println("��� : " +word);
		}
}
