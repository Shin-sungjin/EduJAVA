package ListExam;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class OperTestList {
	//성능 테스트 
	   public static void main(String[] args) {
		      
		   		//arrayList는 처음부터 끝까지 순차적으로 데이터를 추가할 떄 유리
		   		ArrayList<String> arrayList = new ArrayList<>();
		   		
		   		//LinkedList는 중간마다 필요한 부분을 추가할 때 유리.
		   		LinkedList<String> linkeList = new LinkedList<>(); 
		   		
		   		
		        System.out.println("= 순차적으로 추가하기 ="); 
		        System.out.println("ArrayList :"+add1(arrayList)); 
		        System.out.println("LinkedList :"+add1(linkeList)); 
		        System.out.println(); 
		        
		        System.out.println("= 중간에 추가하기 ="); 
		        System.out.println("ArrayList(배열복사발생) :"+add2(arrayList)); 
		        System.out.println("LinkedList(노드값 변경) :"+add2(linkeList)); 
		        System.out.println(); 
		        
		        System.out.println("= 중간에서 삭제하기 ="); 
		        System.out.println("ArrayList(배열복사발생) :"+remove2(arrayList)); 
		        System.out.println("LinkedList(노드값 변경) :"+remove2(linkeList)); 
		        System.out.println(); 
		        
		        System.out.println("= 순차적으로 삭제하기 ="); 
		        System.out.println("ArrayList :"+remove1(arrayList)); 
		        System.out.println("LinkedList :"+remove1(linkeList)); 
		   } 
		   //순차적데이터 추가
		   public static long add1(List<String> list) { 
		        long start = System.currentTimeMillis(); 
		        for(int i=0; i<1000000;i++)
		           list.add(i+""); 
		        long end = System.currentTimeMillis(); 
		        return end - start; 
		   } 
		   //비순차적 데이터 추가
		   public static long add2(List<String> list) { 
		      long start = System.currentTimeMillis(); 
		      for(int i=0; i<10000;i++) 
		         list.add(500, "X"); 
		      long end = System.currentTimeMillis(); 
		      return end - start; 
		   } 
		   //순차적 데이터 삭제
		   public static long remove1(List<String> list) { 
		      long start = System.currentTimeMillis(); 
		       for(int i=list.size()-1; i >= 0;i--) 
		             list.remove(i); 
		       long end = System.currentTimeMillis(); 
		       return end - start; 
		   } 
		   //비순차적 데이터 삭제 
		   public static long remove2(List<String> list) { 
		      long start = System.currentTimeMillis(); 
		       for(int i=0; i<10000;i++)
		             list.remove(i); 
		       long end = System.currentTimeMillis(); 
		       return end - start; 
		   } 
}
