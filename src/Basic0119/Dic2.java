package Basic0119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dic2 implements ParisInter{
	String keyArray[]; //key 들을 저장하는 배열
	String valueArray []; //value 들을 저장하는 배열
	
	Dic2(int a){
		keyArray = new String[a];
		valueArray = new String[a];
	}
	@Override
	public String get(String key) {
		String result = null;
		for(int i = 0; i<keyArray.length; i++) {
			//nullPointException 이 발생한 구문
			if(key!= null || keyArray[i].equals(key)) {
				result = this.valueArray[i];
			}
		}
		return result;
	}

	
	//key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
	@Override
	public void put(String key, String value) {
		
		for(int i = 0; i<keyArray.length; i++) {
			if(key != null || keyArray[i].equals(key)) {
				valueArray[i] = value;
			}
			else if(key != null || !keyArray[i].equals(key)) {
				keyArray[i] = key;
				valueArray[i] = value;
			}
		}

		
	}

	@Override
	public String delete(String key) {
		// TODO Auto-generated method stub
		  String result = null;
		  int idx = 0;
		  for(int i =0; i < keyArray.length; i++) {
		  if(key != null || keyArray[i].equals(key)) {
			 idx = i;
		  	}
		  }
		  List<String> strList = new ArrayList<>(Arrays.asList(keyArray));
		  Integer k = strList.indexOf(key);
		  strList.remove(k);
		  keyArray = strList.toArray(new String[0]);
//		  List<String> strlist = new ArrayList<>(Arrays.asList(valueArray));		  
//		  strlist.remove(k);
//		  valueArray = strlist.toArray(new String[0]);
//		 
//		  System.out.println(k);  //=> k값이 -1임,,,
		  valueArray[idx] = "null";
		  //자바의 null 은 object type , 키워드로 사용은 가능 
		//ArrayIndexOutOfBoundsException 오류 발생, delete로 인해 인덱스 배열이 1 줄었기 때문에,
		// 이러한 오류가 발생하는 것으로 보이나, 명확한 해결 방법이 떠오르지 않는다.
		return valueArray[idx];
	}

	@Override
	public int length() {
		int result = valueArray.length;
		return result;
	}

}
