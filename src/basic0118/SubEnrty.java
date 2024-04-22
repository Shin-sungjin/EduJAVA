package basic0118;

public class SubEnrty extends Enrty {

		String definition;
		int year;
		
		

		SubEnrty(String w) {
			new Enrty(w); //약어가 부모클래스의 Entry(s)로 들어감.
		}
		
		 SubEnrty(String w, String d, int y) {
			// w는 약어, d는 원문
			new SubEnrty(w);
			this.definition = d;
			this.year = y;
		}
		public void printView() {
			
			System.out.println("원어 : " + definition);
			System.out.println("시기 : " + year);
		}
}
