package CollectionAndGeneric;


// ���׸��� ����ϴ� ���, 
// ���� �޼ҵ�� ���׸��� �ٷ� ��밡�� 

// T : Type;
// e : Element;
// => �ڵ��� �������� ������������ ���� �� ���� 


// ���׸��� ����ϴ� ��� 
public  class Kdigita3th<T> {
	
	
	// T�� Ÿ���� �������� ���� ��Ȳ;
	// �� Ŭ������ ����� �� ������.
	
	
	//Ÿ���� �������� �ñ�� ���α׷��� ������ ��
	// ���׸��� ������ �� ����� �� ���� Ű����� ����?
	// static 
	private T t; //���׸� ��ü�� ��� ���� 

	public Kdigita3th() {
		
	}
	// ���׷��� ��� �� �� �ݵ�� getter/setter�� �ʿ� 

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
}
