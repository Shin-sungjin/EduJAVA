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
	
	 //key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
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

	
//abstract String delete(String key); //key ���� ���� ������(value�� �Բ�) ����. ������ value �� ����
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
