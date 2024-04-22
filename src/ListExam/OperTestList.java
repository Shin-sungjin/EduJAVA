package ListExam;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class OperTestList {
	//���� �׽�Ʈ 
	   public static void main(String[] args) {
		      
		   		//arrayList�� ó������ ������ ���������� �����͸� �߰��� �� ����
		   		ArrayList<String> arrayList = new ArrayList<>();
		   		
		   		//LinkedList�� �߰����� �ʿ��� �κ��� �߰��� �� ����.
		   		LinkedList<String> linkeList = new LinkedList<>(); 
		   		
		   		
		        System.out.println("= ���������� �߰��ϱ� ="); 
		        System.out.println("ArrayList :"+add1(arrayList)); 
		        System.out.println("LinkedList :"+add1(linkeList)); 
		        System.out.println(); 
		        
		        System.out.println("= �߰��� �߰��ϱ� ="); 
		        System.out.println("ArrayList(�迭����߻�) :"+add2(arrayList)); 
		        System.out.println("LinkedList(��尪 ����) :"+add2(linkeList)); 
		        System.out.println(); 
		        
		        System.out.println("= �߰����� �����ϱ� ="); 
		        System.out.println("ArrayList(�迭����߻�) :"+remove2(arrayList)); 
		        System.out.println("LinkedList(��尪 ����) :"+remove2(linkeList)); 
		        System.out.println(); 
		        
		        System.out.println("= ���������� �����ϱ� ="); 
		        System.out.println("ArrayList :"+remove1(arrayList)); 
		        System.out.println("LinkedList :"+remove1(linkeList)); 
		   } 
		   //������������ �߰�
		   public static long add1(List<String> list) { 
		        long start = System.currentTimeMillis(); 
		        for(int i=0; i<1000000;i++)
		           list.add(i+""); 
		        long end = System.currentTimeMillis(); 
		        return end - start; 
		   } 
		   //������� ������ �߰�
		   public static long add2(List<String> list) { 
		      long start = System.currentTimeMillis(); 
		      for(int i=0; i<10000;i++) 
		         list.add(500, "X"); 
		      long end = System.currentTimeMillis(); 
		      return end - start; 
		   } 
		   //������ ������ ����
		   public static long remove1(List<String> list) { 
		      long start = System.currentTimeMillis(); 
		       for(int i=list.size()-1; i >= 0;i--) 
		             list.remove(i); 
		       long end = System.currentTimeMillis(); 
		       return end - start; 
		   } 
		   //������� ������ ���� 
		   public static long remove2(List<String> list) { 
		      long start = System.currentTimeMillis(); 
		       for(int i=0; i<10000;i++)
		             list.remove(i); 
		       long end = System.currentTimeMillis(); 
		       return end - start; 
		   } 
}
