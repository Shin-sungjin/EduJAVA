package GenericPlus;

public class Course<T> {
	private String name;
	private T[] students;
	
	@SuppressWarnings("unchecked")
	public Course(String name, int size) {
		super();
		this.name = name;
		
		//���� TŸ���� ������ ���� �ʾұ� ������ �迭�� ������ �� ���� ����.		
		this.students = (T[])new Object[size];
	}
	
	public void add(T t) {
		for(int i=0; i<this.students.length; i++) {
			if(students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

	public String getName() {
		return name;
	}

	public T[] getStudents() {
		return students;
	}
}
