package basic0118;

public class SubEnrty extends Enrty {

		String definition;
		int year;
		
		

		SubEnrty(String w) {
			new Enrty(w); //�� �θ�Ŭ������ Entry(s)�� ��.
		}
		
		 SubEnrty(String w, String d, int y) {
			// w�� ���, d�� ����
			new SubEnrty(w);
			this.definition = d;
			this.year = y;
		}
		public void printView() {
			
			System.out.println("���� : " + definition);
			System.out.println("�ñ� : " + year);
		}
}
