package GenericPlus;

import java.util.Arrays;

public class GenericWildCard {

	
	//어떤 객체도 상관없이 다 받음
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생" + 
						   Arrays.toString(course.getStudents()));
	}
	
	// Student 클래스거나 or Student를 상속받는 클래스만 허용
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생" + 
						   Arrays.toString(course.getStudents()));
	}
	
	// Worker 클래스거나 Worker의 상위 클래스만 가능
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생" + 
						   Arrays.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
		// 제네릭 와일드카드
		// 이미 선언되어있는 제네릭 타입을 파라미터나 리턴타입으로 사용할때
		// 타입 파라미터를 제한할 목적으로 사용.

		Course<Person> perCourse = new Course<Person>("일반인과정", 3);
		// 참조 타입의 경우  add Method 가능
		perCourse.add(new Person("일반인 1인"));
		//registerCourse(perCourse);
//		registerCourseStudent(perCourse); 
		registerCourseWorker(perCourse);
		
		
		Course<Worker> amugerna = new Course<>("직장인과정", 4);
		
		Course<Student> amugerna2 = new Course<>("외계인과정", 5);
//		registerCourseWorker(amugerna2);
		
		
		//registerCourse(amugerna);
		// 와일드 카드 타입의 3가지 형태
		// 제네릭<?>
		
		
		// 제네릭<? extends 부모타입>
		// 제네릭<? super 하위타입>
		
		
		
		
	}
}
