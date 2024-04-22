package GenericPlus;

import java.util.Arrays;

public class GenericWildCard {

	
	//� ��ü�� ������� �� ����
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������" + 
						   Arrays.toString(course.getStudents()));
	}
	
	// Student Ŭ�����ų� or Student�� ��ӹ޴� Ŭ������ ���
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "������" + 
						   Arrays.toString(course.getStudents()));
	}
	
	// Worker Ŭ�����ų� Worker�� ���� Ŭ������ ����
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "������" + 
						   Arrays.toString(course.getStudents()));
	}
	
	
	public static void main(String[] args) {
		// ���׸� ���ϵ�ī��
		// �̹� ����Ǿ��ִ� ���׸� Ÿ���� �Ķ���ͳ� ����Ÿ������ ����Ҷ�
		// Ÿ�� �Ķ���͸� ������ �������� ���.

		Course<Person> perCourse = new Course<Person>("�Ϲ��ΰ���", 3);
		// ���� Ÿ���� ���  add Method ����
		perCourse.add(new Person("�Ϲ��� 1��"));
		//registerCourse(perCourse);
//		registerCourseStudent(perCourse); 
		registerCourseWorker(perCourse);
		
		
		Course<Worker> amugerna = new Course<>("�����ΰ���", 4);
		
		Course<Student> amugerna2 = new Course<>("�ܰ��ΰ���", 5);
//		registerCourseWorker(amugerna2);
		
		
		//registerCourse(amugerna);
		// ���ϵ� ī�� Ÿ���� 3���� ����
		// ���׸�<?>
		
		
		// ���׸�<? extends �θ�Ÿ��>
		// ���׸�<? super ����Ÿ��>
		
		
		
		
	}
}
