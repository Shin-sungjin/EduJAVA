package SetExam;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
		// Set 
		// ����ó�� �ߺ����� �ʴ� ���ҵ��� ����
		// ���а��õ� ���뿡 ���
		// ���հ� ���� 
		
		// Set
		// TreeSet
		// hashSet
		// LinkedHashSet
		
		// LinkedHashset
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		set.add("1");
		set.add("12");
		set.add("23");
		set.add("14");
		set.add("2");
		set.add("5");
		for(String val : set) {
			System.out.println(val);
		}
		
		// A ����
		List<String> set1 = Arrays.asList("1", "2", "3", "4", "5");
		TreeSet<String> A = new TreeSet<>(set1);

		// B ����
		List<String> set2 = Arrays.asList("3", "4", "5", "6", "7");
		TreeSet<String> B = new TreeSet<>(set2);

		// C ����
		List<String> set3 = Arrays.asList("3", "4");
		TreeSet<String> C = new TreeSet<>(set3);
		
		
		//�ش� Method�� �κ����� ����
		// ���� ���� ����
		// �ٵ� ������ ������ ����� ���� 
		// �κ����� ���� Ȯ��.
	      boolean contain = B.containsAll(C);
	      System.out.println("C �� B " + contain);
	      
	      //���Կ���Ȯ��
	      boolean isContain = B.contains("7");
	      System.out.println("7 �� B ? "+ isContain);
	      
	      // ������ ����
	      TreeSet<String> cloneA = new TreeSet<>(set1);
	      boolean isModified = cloneA.retainAll(B);
	      System.out.println("A �� B ? "+cloneA);
	      
	      // ������ ����
	      TreeSet<String> cloneB = new TreeSet<>(set1);
	      boolean isModified2 = cloneB.addAll(B);
	      System.out.println("A �� B ? "+cloneB);
	      
	      // ������ ����
	      TreeSet<String> cloneC = new TreeSet<>(set1);
	      boolean isModified3 = cloneC.removeAll(B);
	      System.out.println("A - B ? "+cloneC);
			
		// Set Ȱ�� ���� 

	}

}
