package CollectionAndGeneric;

import java.util.ArrayList;
import java.util.List;

public class KdigtitaMain {

		public static void main(String[] args) {
			Kdigita3th<String> yuKyung = new Kdigita3th<>(); 
			yuKyung.setT("������");
			String name = yuKyung.getT();
			System.out.println(name);
		
			// �������� ����ȭ, Ÿ�� ��ȯ���� �� ������ �� ���� �߻��� ��Ʈ�� �ϱ� ���� 
			// Wrapper Ŭ������ Ȱ��.
//			Kdigita3th<Integer> gunchim2 = new Kdigita3th<>();
//			gunchim2.setT(972);
//			int val = gunchim2.getT();
//			System.out.println(val);
			
			// ��������� �ν��ͽ����� Ÿ���� ������. 
			// �÷��� ������ ��ũ�� ���׸��� �� �־�� �ϰ�, 
			// �������� ��ȭ ���� 
			// �ν��Ͻ� ���� ������, Ÿ���� �׶� �׶�  ��ȯ
			// ���ǹ��� ���� Ÿ���� ���� ����
			// ������ ����, ���ڸ� �Է��ؾ� ����, ���ڸ� �Է��ؾ� ���� �б����� ������ �� 
			// ���� 
			
			
			Kdigita3th<NamWook> namwook = new Kdigita3th<NamWook>();
			namwook.setT(new NamWook());  //�ڵ��ڽ�
			System.out.println(namwook.getT());
			
			List<TestDTO> list1 = new ArrayList<TestDTO>();
			//DTO �������� ��ΰ� �Ǵ� Ŭ���� 
			// ���׸������� WrapperClss �� ����, ����ڰ� ������ Ŭ������ �� �� �־�
			
			String test1 = "zzz";
			
		}
		
		
}
