package MapExam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam2 {
	public static void main(String[] args) {
//		Map<StudentDTO, String> map = new HashMap<StudentDTO, String>();
//		
//		map.put(new StudentDTO("A001", "��ħ"), "9724");
//		map.put(new StudentDTO("A003", "��ħ"), "9725");
//		map.put(new StudentDTO("A002", "���ظ�"), "1234");
//		//Ű���� ���� �� �� �������� �Ҵ��� �������� ��,
////		System.out.println(map.toString());
//		System.out.println(map.get(new StudentDTO("A001", "��ħ")));
//		
//		Set<StudentDTO> keyset = map.keySet();
//		Iterator<StudentDTO> iterator = keyset.iterator();
//		while(iterator.hasNext()) {
//			StudentDTO key = iterator.next();
//			//�ݺ��ڸ� ���ؼ� ���� Ű���� ������ ���� ���´�.
//			System.out.print(key.getSid());
//			System.out.println("\t"+key.getName());
////			String value = map.get(key);
////			System.out.println(key.getSid() + " : " + value);
//		}
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1001, " ���� "), 95);
		map.put(new Student(2001, " �Ƿη� "), 100);
		map.put(new Student(3001, " ���� "),  58);
		
		Set<Student> keyset = map.keySet();
		Iterator<Student> iterator =keyset.iterator();
		
	}
}
