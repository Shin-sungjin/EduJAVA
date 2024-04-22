package SetExam;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class SetExam {
	public static void main(String[] args) {
		// Set 
		// 집합처럼 중복되지 않는 원소들의 모음
		// 수학관련된 내용에 사용
		// 집합과 유사 
		
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
		
		// A 집합
		List<String> set1 = Arrays.asList("1", "2", "3", "4", "5");
		TreeSet<String> A = new TreeSet<>(set1);

		// B 집합
		List<String> set2 = Arrays.asList("3", "4", "5", "6", "7");
		TreeSet<String> B = new TreeSet<>(set2);

		// C 집합
		List<String> set3 = Arrays.asList("3", "4");
		TreeSet<String> C = new TreeSet<>(set3);
		
		
		//해당 Method의 부분집합 여부
		// 자주 쓰진 않음
		// 근데 가지고 있으면 쓸모는 있음 
		// 부분집합 여부 확인.
	      boolean contain = B.containsAll(C);
	      System.out.println("C ⊂ B " + contain);
	      
	      //포함여부확인
	      boolean isContain = B.contains("7");
	      System.out.println("7 ⊂ B ? "+ isContain);
	      
	      // 교집합 추출
	      TreeSet<String> cloneA = new TreeSet<>(set1);
	      boolean isModified = cloneA.retainAll(B);
	      System.out.println("A ∩ B ? "+cloneA);
	      
	      // 합집합 추출
	      TreeSet<String> cloneB = new TreeSet<>(set1);
	      boolean isModified2 = cloneB.addAll(B);
	      System.out.println("A ∪ B ? "+cloneB);
	      
	      // 차집합 추출
	      TreeSet<String> cloneC = new TreeSet<>(set1);
	      boolean isModified3 = cloneC.removeAll(B);
	      System.out.println("A - B ? "+cloneC);
			
		// Set 활용 예시 

	}

}
