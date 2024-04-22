package MapExam;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		// Map
		// Key, Value 구조 ;
		// 위와 같은 구조로 구성된 데이터를 저장하는 클래스 
		// 비순차적인 것이 특징
		// key를 통해 value를 찾아간다. 
		// key를 통한 데이터 검색에 최적화 되어있다. 
		// - 단 key 값이 중복되어서는 안됨. 
		
		// 회원 정보와 아이디
		// id		      name
		// gunchim		  lupy
		// jmcho		  chojunmo
		// snowkim		  kimseol
		// pinballQueen   leegaeun
		// inballKing     kimhtunseok
		// captainciggle  sjinyukyung
		
		Map<String, String> map = new HashMap<String, String>();
		// String 자자리에 현업에서는 주로 VO와 DTO가 들어옴
		map.put("gunchim", "lupy");
		map.put("jmcho", "chojunmo");
		map.put("snowkim", "kimseol");
		map.put("pinballQueen", "leegaeun");
		map.put("inballKing", "kimhtunseok");
		map.put("captainciggle", "sjinyukyung");
		
		System.out.println(map.size());
		System.out.println(map.get("snowkim"));
		// map에 있는 데이터를 찾을때에는 key만 생각할 것.
		
		// map 컬렉션에 있는 key 값만 Set 타입으로 변경
		Set<String> set = map.keySet();
		
		
		// 맵 컬렉션에 있는 데이터를 반복하는 방법 1
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			//반복자를 통해서 얻은 키갓을 가지고 값을 얻어온다.
			String value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println();
		//key와 value를 따로 뽑아내는 공식
	      Set<Map.Entry<String, String>> entrySet = map.entrySet();
	      System.out.println("EntrySet()을 이용해서 출력해 봄");
	      Iterator<Map.Entry<String, String>> entryIterator = entrySet.iterator();
	      
	      while(entryIterator.hasNext()) {
	         Map.Entry<String, String> entry = entryIterator.next();
	         String key = entry.getKey();  //키값을 얻는다.
	         String value = entry.getValue(); //값을 얻는다.
	         System.out.println(key + " : " + value);
	      }   
	}
}
