package basic0118;

public class Enrty {

		String word;
		
		//출력
//		public void Enrty() {
//			System.out.println("***약어사전***");
//			
//			
//		}
//		
//		public void Enrty(String w) {
//
//			this.word = w;
//			Enrty();
//		}
		
		//생성자 오버로딩
		Enrty(){
			System.out.println("***약어사전***");
			writeView();
		}
		
		Enrty(String w){
			this.word = w;
			new Enrty();
		}		
		
		public void writeView() {
			System.out.println("약어 : " +word);
		}
}
