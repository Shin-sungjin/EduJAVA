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
	   //�ݺ��� �� �� �������̵��� �ʼ� ;
	   
	   
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
		Student student1 = new Student(1, "�̰���");
		Student student2 = new Student(1, "������");
		Student student3 = new Student(3, "��μ�");
		
		//���� ��ü �ΰ�, �������� ������ Ŭ����(�޼ҵ�)
//		int result = Objects.compare(student1, student2, new StudentCom());
//		if(result>0) {
//			System.out.println("o1�� �� ũ�� ");
//		}
//		else if(result==0) {
//			System.out.println("���� �й� ");
//		}
//		else {
//			System.out.println("o2�� �� ŭ");
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
