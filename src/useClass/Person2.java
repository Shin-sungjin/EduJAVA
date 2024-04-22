package useClass;

import java.util.Arrays;
import java.util.Objects;

public class Person2 {
	   private String name;
	   private int age;
	   int[] arr;
	   
	   public Person2() {
	   }

	   public Person2(String name, int age) {
	      super();
	      this.name = name;
	      this.age = age;
	   }
	   
	   public Person2(String name, int age, int[] arr) {
		   this.name = name;
		   this.age = age;
		   this.arr = arr;
	   }

	   public String getName() {
	      return name;
	   }

	   public int getAge() {
	      return age;
	   }   
	   
	   @Override
	   public int hashCode() {
		   // �������� �ű԰��߽� �ؽ��ڵ带 ��� �����ڵ� 
		   return  Objects.hash(this.age, this.name, Arrays.toString(this.arr));
	   }
	   
	   
}
