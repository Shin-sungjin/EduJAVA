package Basic0119;

import java.util.ArrayList;
import java.util.List;

public class Dic implements ParisInter{

	private List<String> KeyArray = new ArrayList<String>();
	private List<String> valueArray = new ArrayList<String>();
	
	
	@Override
	public String get(String key) {
		String result;
		if(KeyArray.contains(key)) {
			int k = KeyArray.indexOf(key);
			result = valueArray.get(k);
		}
		else {
			result = null;
		}
		return result;
	}
	
	 //key와 value를 쌍으로 저장. 기존에 key가 있으면, 값을 value로 수정
	@Override
	public void put(String key, String value) {
		if( !KeyArray.contains(key)) {
			KeyArray.add(key);
			valueArray.add(value);
		}
		else if(KeyArray.contains(key)) {
			int k = KeyArray.indexOf(key);
			valueArray.set(k, value);
		}
		
	}

	
//abstract String delete(String key); //key 값을 가진 아이템(value와 함께) 삭제. 삭제된 value 값 리턴
	@Override
	public String delete(String key) {
		String del = null;
		if(KeyArray.contains(key)) {
			int k = KeyArray.indexOf(key);
			KeyArray.remove(k);
			valueArray.remove(k);
			del =valueArray.get(k);
		}
		return del;
	}

	@Override
	public int length() {
		int result= valueArray.size();
		// TODO Auto-generated method stub
		return result;
	}

}
