import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basic0122 {
	public static void main(String[] args) {
		List<String> boook = new ArrayList();
		
		Museum book =new Museum("������", boook);
		book.bookinput("������", "�ʿ��� �ϰ� ���� ��");
		book.bookinput("������", "��¼���");
		book.bookLoad("������");
		
		List<Integer> songList = new ArrayList();
		for(int i = 0; i < 5; i++) {
			songList.add(i+1);
		}
		List<Integer> CountList = new ArrayList();
		CountList.add(101);
		CountList.add(102);
		CountList.add(103);
		CountList.add(101);
		CountList.add(105);
		
		PlayList pli = new PlayList(songList, CountList);
		pli.sortLiSt();

			 // ���� ����� ��µ��� �ʴ´�,,
		
	}
	
	/**���� 1 
	������ �з� �ý��� ���������� å �з��� �����ϱ� ���� �� å�� �帣�� ���� �з��� �Ϸ��� �մϴ�. 
	�� å�� �帣�� �ش� �帣�� ���Ե� å�� ����� ���� ���� �־����ϴ�. 
	�̶�, Ư�� �帣�� ���� ��� å�� ������ ã�� �Լ��� �ۼ��Ͻʽÿ�.
	*/
}
	//���� 1��
 class Museum{
	 // �帣
	 // �Ҽ�
	 // ������
	 // ���� 
	 // ��Ÿ ���
	Map<String, List> map= new HashMap<>();
	List<Object> bookname = new ArrayList();
	
	
	//������ Key�� �پ��� value�� �ҷ��÷���
	// value���� List�� �޾ƾ� �� �� ����. 
	Museum(String type, List bookname) {
		map.put(type, bookname);
		// TODO Auto-generated constructor stub
	}
	
//	Museum(String type){
//		map.put(type, null);
//	}
	
	
	//List�� value���� �ָ� ������ ���� �ϳ��� Ű�� ���� �پ��� ���� ������ �����ϳ�. 
	public void bookinput(String type, String bookName) {
		map.get(type).add(bookName);
	}
	
	public void bookLoad(String type) {
		for(int i =0; i<map.keySet().size(); i++ ) {
			System.out.println(type+"�� å�� "+map.get(type)+"�� �� �ֽ��ϴ�.");
			
		}
	}
}
 
 
// ���� 2 - ������ ���� ������ ���ӿ����� ������ �׸��� ���·� ��ġ�Ǿ� �ֽ��ϴ�. 
//	�� ���� ����ְų� �׾��ִ� �� ���¸� �����ϴ�. ������ ���´� �ֺ� ������ ���¿� ���� ��ȭ�ϰ� �˴ϴ�. 
//	�̶�, �־��� �׸��带 ������ �Ǵ� �������� n�� ȸ����Ű�� �Լ��� �ۼ��Ͻʽÿ�. 
//	ȸ���� ����� Ƚ���� �Լ��� ���ڷ� �־����ϴ�.
class LifeGame{
	//������ ��  = ������ ���� ������ �޴´�. 
	// ex) �������� ����ִ� ���� 3�����  ~~
	// ex2) ���� ������ �׾��ִ� ���� 2�����϶�� ~~
	// �̶�, �־��� �׸��带 ������ �Ǵ� �������� n�� ȸ����Ű�� �Լ��� �ۼ��Ͻʽÿ�. 
//	ȸ���� ����� Ƚ���� �Լ��� ���ڷ� �־����ϴ�.
	
	// grade �־���
	// ���� ���� ��ȭ�� ���� ���۸� �ϸ� ��. 
	// ex) ���������� = > ���� ���� 3���̻��� ���
	// ex) ��������  -> ���� ���� 2�������� ���
	
	// �׸��� = ���� ����
	// x, y��ǥ�� �ʿ��� �� ���� - > 2���� �迭???
	
	int[][] grade;
	
	
	
}

/*���� 3
��ħ�̴� ���� ��Ʈ���� ���񽺸� ��ϰ� �ֽ��ϴ�. 
��ħ�̴� ����ڵ��� �÷��� ����� �������� ���� ���� ����� ���� ������� �����Ϸ� �մϴ�. 
������ Ƚ���� ����� ���� �ִٸ�, �� ��ȣ�� �� ū ���� ���� �����Ϸ��� �մϴ�. 
�� ��ȣ�� ���Ƚ���� ��� ����Ʈ�� �־��� ��, ��ħ�̰� ���ϴ� ������ �����ϴ� �Լ��� �ۼ��Ͻʽÿ�.*/

class PlayList{
	//�� ���踦 �߸� �� �� ����. 
	// ������� �䱸�� �ش� ���� ������ �Է��ϴ� ���� �ƴ϶�
	// �׳� ������ ���� ���ε� ���� Map �� �ʿ䰡 �ֳ�??
	// �ٵ� Map �� ������� ������, ���Ƚ���� �Բ� �� ������ �Բ� ��������� �ϴµ�
	// �׷��ٸ� �Ϲ����� sort, reverse �����ڸ� ����ϱ� ���� ������ ��������. 
	
	
//	Map<List, List> plist = new HashMap<List,List>();
	private Map<Integer, Integer> plist = new HashMap<Integer,Integer>();
	private List<Integer> songList = new ArrayList<>(plist.keySet());
	private List<Integer> countList = new ArrayList<>(plist.keySet());
	// ������ ������ ���� ����Ʈ
	
	PlayList(List Snum, List Plist){
		songList.addAll(Snum);
		countList.addAll(Plist);
	}
	
	public void sortLiSt() {
		for(Integer i : songList) {
			System.out.print(songList.get(i-1));
			System.out.println("-"+ countList.get(i-1));
		}
		// �������� �˰����� �̿��غ����� 
	    for (int i = 0; i < countList.size() - 1; i++) {
	        int tem = 0;
	    	for (int j = 0; j < countList.size() - i - 1; j++) {
	            if(countList.get(j) == countList.get(j+1)) {
	            	if( songList.get(j) < songList.get(j+1)) {
	            		tem = songList.get(j);
	            		songList.set(j, songList.get(j+1));
	            		//j ��ġ�� J+1 ��ġ 
	            		songList.set(j+1, tem);
	            		//j+1�� j �� ��ġ
	            	}
	            }
	    		if (countList.get(j) < countList.get(j+1)) {//�������� ����
	    			int pl = countList.get(j);
	    			int sn = songList.get(j);
	    			
	    			countList.set(j, countList.get(j+1));
	    			countList.set(j +1, pl);
	    			
	            	
	            	
	            }
	        }
	    }
	}
		
//	PlayList(int[] sNumber, int[] Pcount){
//		for(int  i=0; i< sNumber.length; i++) {
//			plist.put( sNumber[i], Pcount[i]);
//		}
//		this.sortList = sortList;
//		
//	}
//	
//	public List getKeyList() {
//		return this.keyList;
//	}
//	
//	public void pliiSort() {
//		// for�� �˰�������, �÷��� ����Ʈ ���� 
//		//�ٵ� f����Ʈ�� ��ü �ؾ� �ϴ°ǰ�?
//	    Collections.sort(sortList, (o1, o2) -> (plist.get(o1).compareTo(plist.get(o2))));
//	    // value�� ���� ��. 
//	    // �ٵ� Ű���� �ڵ����� ��ȭ�� �� ������, �׷� ���� ���� ���ؼ� ���� �ѹ��� ü���� ����� �ϳ�. 
//		for(Integer key : sortList) {
//			System.out.println("key : " + key + " / " + "value : " + plist.get(key));
//		}  
//	
//	}
}

