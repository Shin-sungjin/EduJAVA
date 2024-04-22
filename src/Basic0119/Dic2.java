package Basic0119;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dic2 implements ParisInter{
	String keyArray[]; //key ���� �����ϴ� �迭
	String valueArray []; //value ���� �����ϴ� �迭
	
	Dic2(int a){
		keyArray = new String[a];
		valueArray = new String[a];
	}
	@Override
	public String get(String key) {
		String result = null;
		for(int i = 0; i<keyArray.length; i++) {
			//nullPointException �� �߻��� ����
			if(key!= null || keyArray[i].equals(key)) {
				result = this.valueArray[i];
			}
		}
		return result;
	}

	
	//key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
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
//		  System.out.println(k);  //=> k���� -1��,,,
		  valueArray[idx] = "null";
		  //�ڹ��� null �� object type , Ű����� ����� ���� 
		//ArrayIndexOutOfBoundsException ���� �߻�, delete�� ���� �ε��� �迭�� 1 �پ��� ������,
		// �̷��� ������ �߻��ϴ� ������ ���̳�, ��Ȯ�� �ذ� ����� �������� �ʴ´�.
		return valueArray[idx];
	}

	@Override
	public int length() {
		int result = valueArray.length;
		return result;
	}

}
