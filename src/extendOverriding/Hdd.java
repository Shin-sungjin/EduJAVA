package extendOverriding;

public class Hdd extends Object{
	
	 int size;
	 int rpm;
	
	 Hdd(){
		this.size = 0;  //this�� �ν��Ͻ� ������
		this.rpm = 0;
	}
	 Hdd(int size, int rpm){
		this();
		this.size = size;
		this.rpm = rpm;
	}
	
	 void serchStat() {
		System.out.println(this.size);
		System.out.println(this.rpm);
	}
	
	public  void main(String[] args) {
		
		Hdd hd = new Hdd();			
		System.out.println("hd");
		hd.serchStat();
		
		Hdd hd2 = new Hdd(100, 5000000);	
		
		System.out.println("hd2");
		hd2.serchStat();
	
		}
	}
	
	
	//quiz
	// �����ڸ� �ΰ� ���� 
	// 1. non
	// 2. �Ӽ� ��� �Ķ���ͷ� ������ �ִ� ������
	// ����, �ν��Ͻ� ������, �Ӽ����� ������ �� �־�� ��
	// ���� 3.
	// 3. �ش� �ż��� ȣ�� �� �뷮�� �ӵ��� �� �� �ִ� 
	//     -serchSet() �ż��� ���� 
	//		- �Ķ���� �� ���� �� �ʿ��ϴٰ� �ǴܵǸ� ����


	
