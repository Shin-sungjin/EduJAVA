package useClass;

import java.util.Comparator;
import java.util.Objects;

public class CompareExam {
	
	   static class Student {
		      int sno;
		      String name;
		      
		      public Student(int sno, String name) {
		         this.sno = sno;
		         this.name = name;
		      }
		   }
	   //반복자 쓸 때 오버랄이딩이 필수 ;
	   
	   
	   static class StudentCom implements Comparator<Student>{
	      public int compare(Student o1, Student o2){
	          if(o1.name.compareTo(o2.name) < 0)
	              return -1;
	           else if(o1.name.compareTo(o2.name) == 0)
	              return 0;
	           else
	              return 1;
	      }
		   
	   }

	   
	public static void main(String[] args) {
		Student student1 = new Student(1, "이가은");
		Student student2 = new Student(1, "박희정");
		Student student3 = new Student(3, "김민서");
		
		//비교할 객체 두개, 마지막엔 만들어둔 클래스(메소드)
//		int result = Objects.compare(student1, student2, new StudentCom());
//		if(result>0) {
//			System.out.println("o1이 더 크다 ");
//		}
//		else if(result==0) {
//			System.out.println("같은 학번 ");
//		}
//		else {
//			System.out.println("o2가 더 큼");
//		}
//		
	      int result = Objects.compare(student1, student3, 
	    		  new Comparator<Student>() {
	          @Override
	          public int compare(Student o1, Student o2) {
	             if(o1.sno < o2.sno)
	                return -1;
	             else if(o1.sno == o2.sno)
	                return 0;
	             else
	                return 1;
	          }         
	       });
	      System.out.println(result);//??
	}
}
