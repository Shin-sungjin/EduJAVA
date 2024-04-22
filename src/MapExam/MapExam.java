package MapExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		// Map
		// Key, Value ���� ;
		// ���� ���� ������ ������ �����͸� �����ϴ� Ŭ���� 
		// ��������� ���� Ư¡
		// key�� ���� value�� ã�ư���. 
		// key�� ���� ������ �˻��� ����ȭ �Ǿ��ִ�. 
		// - �� key ���� �ߺ��Ǿ�� �ȵ�. 
		
		// ȸ�� ������ ���̵�
		// id		      name
		// gunchim		  lupy
		// jmcho		  chojunmo
		// snowkim		  kimseol
		// pinballQueen   leegaeun
		// inballKing     kimhtunseok
		// captainciggle  sjinyukyung
		
		Map<String, String> map = new HashMap<String, String>();
		// String ���ڸ��� ���������� �ַ� VO�� DTO�� ����
		map.put("gunchim", "lupy");
		map.put("jmcho", "chojunmo");
		map.put("snowkim", "kimseol");
		map.put("pinballQueen", "leegaeun");
		map.put("inballKing", "kimhtunseok");
		map.put("captainciggle", "sjinyukyung");
		
		System.out.println(map.size());
		System.out.println(map.get("snowkim"));
		// map�� �ִ� �����͸� ã�������� key�� ������ ��.
		
		// map �÷��ǿ� �ִ� key ���� Set Ÿ������ ����
		Set<String> set = map.keySet();
		
		
		// �� �÷��ǿ� �ִ� �����͸� �ݺ��ϴ� ��� 1
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			//�ݺ��ڸ� ���ؼ� ���� Ű���� ������ ���� ���´�.
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		//key�� value�� ���� �̾Ƴ��� ����
	      Set<Map.Entry<String, String>> entrySet = map.entrySet();
	      System.out.println("EntrySet()�� �̿��ؼ� ����� ��");
	      Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
	      
	      while(entryIterator.hasNext()) {
	         Map.Entry<String, String> entry = entryIterator.next();
	         String key = entry.getKey();  //Ű���� ��´�.
	         String value = entry.getValue(); //���� ��´�.
	         System.out.println(key + " : " + value);
	      }   
	}
}
