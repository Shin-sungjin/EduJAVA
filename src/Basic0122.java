import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Basic0122 {
	public static void main(String[] args) {
		List<String> boook = new ArrayList();
		
		Museum book =new Museum("에세이", boook);
		book.bookinput("에세이", "너에게 하고 싶은 말");
		book.bookinput("에세이", "어쩌라고");
		book.bookLoad("에세이");
		
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

			 // 값이 제대로 출력되지 않는다,,
		
	}
	
	/**문제 1 
	도서관 분류 시스템 도서관에서 책 분류를 쉽게하기 위해 각 책의 장르에 따른 분류를 하려고 합니다. 
	각 책의 장르와 해당 장르에 포함된 책의 목록을 가진 맵이 주어집니다. 
	이때, 특정 장르에 속한 모든 책의 제목을 찾는 함수를 작성하십시오.
	*/
}
	//문제 1번
 class Museum{
	 // 장르
	 // 소설
	 // 에세이
	 // 역사 
	 // 기타 등등
	Map<String, List> map= new HashMap<>();
	List<Object> bookname = new ArrayList();
	
	
	//동일한 Key에 다양한 value를 불러올려면
	// value값을 List로 받아야 할 것 같다. 
	Museum(String type, List bookname) {
		map.put(type, bookname);
		// TODO Auto-generated constructor stub
	}
	
//	Museum(String type){
//		map.put(type, null);
//	}
	
	
	//List를 value값을 주면 다음과 같이 하나의 키에 대해 다양한 값의 저장이 가능하낟. 
	public void bookinput(String type, String bookName) {
		map.get(type).add(bookName);
	}
	
	public void bookLoad(String type) {
		for(int i =0; i<map.keySet().size(); i++ ) {
			System.out.println(type+"의 책은 "+map.get(type)+"등 이 있습니다.");
			
		}
	}
}
 
 
// 문제 2 - 라이프 게임 라이프 게임에서는 셀들이 그리드 형태로 배치되어 있습니다. 
//	각 셀은 살아있거나 죽어있는 두 상태를 가집니다. 셀들의 상태는 주변 셀들의 상태에 따라 변화하게 됩니다. 
//	이때, 주어진 그리드를 오른쪽 또는 왼쪽으로 n번 회전시키는 함수를 작성하십시오. 
//	회전의 방향과 횟수는 함수의 인자로 주어집니다.
class LifeGame{
	//인접한 셀  = 주위의 값에 영향을 받는다. 
	// ex) 인접셀에 살아있는 셀이 3개라면  ~~
	// ex2) 인접 ㅂ셀에 죽어있는 셀이 2개이하라면 ~~
	// 이때, 주어진 그리드를 오른쪽 또는 왼쪽으로 n번 회전시키는 함수를 작성하십시오. 
//	회전의 방향과 횟수는 함수의 인자로 주어집니다.
	
	// grade 주어짐
	// 주의 셀의 변화에 따른 조작만 하면 됨. 
	// ex) 오른쪽으로 = > 죽은 셀이 3개이상일 경우
	// ex) 왼쪽으로  -> 죽은 셀이 2개이항일 경우
	
	// 그리드 = 격자 무늬
	// x, y좌표가 필요할 것 같다 - > 2차원 배열???
	
	int[][] grade;
	
	
	
}

/*문제 3
군침이는 음악 스트리밍 서비스를 운영하고 있습니다. 
군침이는 사용자들의 플레이 기록을 바탕으로 가장 많이 재생된 곡을 순서대로 나열하려 합니다. 
동일한 횟수로 재생된 곡이 있다면, 곡 번호가 더 큰 곡을 먼저 나열하려고 합니다. 
곡 번호와 재생횟수가 담긴 리스트가 주어질 때, 군침이가 원하는 정렬을 수행하는 함수를 작성하십시오.*/

class PlayList{
	//씁 설계를 잘못 한 것 같다. 
	// 사용자의 요구는 해당 곡의 정보를 입력하는 것이 아니라
	// 그냥 정렬을 원할 뿐인데 굳이 Map 쓸 필요가 있나??
	// 근데 Map 을 사용하지 않으면, 재생횟수와 함께 곡 정보를 함께 정렬해줘야 하는데
	// 그렇다면 일반적은 sort, reverse 연산자를 사용하기 힘들 것으로 보여진다. 
	
	
//	Map<List, List> plist = new HashMap<List,List>();
	private Map<Integer, Integer> plist = new HashMap<Integer,Integer>();
	private List<Integer> songList = new ArrayList<>(plist.keySet());
	private List<Integer> countList = new ArrayList<>(plist.keySet());
	// 벨류값 정렬을 위한 리스트
	
	PlayList(List Snum, List Plist){
		songList.addAll(Snum);
		countList.addAll(Plist);
	}
	
	public void sortLiSt() {
		for(Integer i : songList) {
			System.out.print(songList.get(i-1));
			System.out.println("-"+ countList.get(i-1));
		}
		// 버블정렬 알고리즘을 이용해보도록 
	    for (int i = 0; i < countList.size() - 1; i++) {
	        int tem = 0;
	    	for (int j = 0; j < countList.size() - i - 1; j++) {
	            if(countList.get(j) == countList.get(j+1)) {
	            	if( songList.get(j) < songList.get(j+1)) {
	            		tem = songList.get(j);
	            		songList.set(j, songList.get(j+1));
	            		//j 위치에 J+1 배치 
	            		songList.set(j+1, tem);
	            		//j+1에 j 값 배치
	            	}
	            }
	    		if (countList.get(j) < countList.get(j+1)) {//내림차순 정렬
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
//		// for문 알고리즘으로, 플레이 리스트 정렬 
//		//근데 f리스트를 해체 해야 하는건가?
//	    Collections.sort(sortList, (o1, o2) -> (plist.get(o1).compareTo(plist.get(o2))));
//	    // value값 정렬 함. 
//	    // 근데 키값은 자동으로 변화할 것 같은데, 그럼 베류 값을 통해서 값을 한번더 체인지 해줘야 하나. 
//		for(Integer key : sortList) {
//			System.out.println("key : " + key + " / " + "value : " + plist.get(key));
//		}  
//	
//	}
}

