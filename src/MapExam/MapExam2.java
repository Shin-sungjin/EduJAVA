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
//		map.put(new StudentDTO("A001", "군침"), "9724");
//		map.put(new StudentDTO("A003", "군침"), "9725");
//		map.put(new StudentDTO("A002", "조준모"), "1234");
//		//키값이 동일 할 시 마지막에 할당한 벨류값이 들어감,
////		System.out.println(map.toString());
//		System.out.println(map.get(new StudentDTO("A001", "군침")));
//		
//		Set<StudentDTO> keyset = map.keySet();
//		Iterator<StudentDTO> iterator = keyset.iterator();
//		while(iterator.hasNext()) {
//			StudentDTO key = iterator.next();
//			//반복자를 통해서 얻은 키갓을 가지고 값을 얻어온다.
//			System.out.print(key.getSid());
//			System.out.println("\t"+key.getName());
////			String value = map.get(key);
////			System.out.println(key.getSid() + " : " + value);
//		}
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1001, " 루피 "), 95);
		map.put(new Student(2001, " 뽀로로 "), 100);
		map.put(new Student(3001, " 포비 "),  58);
		
		Set<Student> keyset = map.keySet();
		Iterator<Student> iterator =keyset.iterator();
		
	}
}
