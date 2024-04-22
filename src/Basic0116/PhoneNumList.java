package Basic0116;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//�ش� ������ �ڵ带 �����ϴ� ���� ������� ���ͳ��� ���� �Ͽ� �ۼ��Ͽ����ϴ�. 
// ��ü���� �ڵ� �帧�� ��ǰ �ڹ� �ؼ��� ���Ұ�, 
// �߰��߰� ������ �κ��� �����ϸ鼭 �ۼ��Ͽ����ϴ�. 
// ���� �κ���, getNUm, getInfo, Search �� ������ �����ϴ�. 
// Ŭ���� �迭�� �����ϴ°��� �� �����Ͽ����ϴ�. 

class SmartPhone{
	private String name;
	private String tel;
	
	public SmartPhone(String name , String tel) {
		this.name =name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}


	public String getTel() {
		return tel;
	}
}

public class PhoneNumList {
	int num;
	String name;
	String tel;
	static SmartPhone[] smart;
	
	
	
	public void getNum() throws IOException {
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		//������ ��� �� �Է�
		System.out.print("�ο��� �Է�>>>");
		num = Integer.parseInt(br.readLine()); //�Ʒ� ���� ��, for ���� ����� ������ ���� �� num �� int num���� ���� �־� �ش� Method �������� �ݺ� �ϰ� �־����ϴ�.
		//Smart phone ��ü �迭 ����
		smart = new SmartPhone[num];  //SmartPhone �迭�� �����Ѵ�. 
	}
	
	public void getInfo() throws IOException{
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		for(int i = 0; i < num; i++) {
			System.out.print("�̸��� ��ȭ��ȣ�� �Է� (��ĭ���� �̸��� ��ȣ �Է�)");
			name = br.readLine();
			tel = br.readLine();
			smart[i] = new SmartPhone(name, tel);	 //������ �� �κ��� �� ���ذ� ���� �ʽ��ϴ�. 
													// �Ƹ���, smart[i] �ε����� ���� name �ν��Ͻ�, tel �ν��Ͻ��� �����ϴ°� ������
													//�̴� 2���� �迭�ΰɱ��,,?
													
		}
		System.out.println("���� �Ǿ����ϴ�.");
	}
	//���� ��. for �ݺ����� ���� �ʰ� �ٷ� ����Ǿ� ������ ���� �߻�, 
	//������ �����غ��ǵ� num ���� ����� ���� ���� �ʴ� ������ ����
	public void Search() throws IOException {
		
		boolean Ok = false;
		
		BufferedReader br= 
				new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			System.out.println("�˻��� �̸� >>");
			name = br.readLine();
			
			if(name.equals("exit")) {
				break;
			}
			
			for(int i = 0; i < num; i++) {
				if(name.equals(smart[i].getName())) {  //�迭���� getName���� ���� �޽��ϴ�.
					System.out.println(name + "�� ��ȭ��ȣ�� " + smart[i].getTel() + "�Դϴ�.");//�� ������ ���� 2���� �迭�� �� ����. smart[i] ���� getTel�޼ҵ带 �̿��Ͽ� tel�� ����
					Ok = true;
				}

				
			}
			if(Ok == false) {
				System.out.println(name + " �� �������� �ʽ��ϴ�. ");
			}
			
			
			
		}
		
	
	
	
	}

	public static void main(String[] args) throws IOException {
		
		PhoneNumList phonelist = new PhoneNumList();
		phonelist.getNum();
		phonelist.getInfo();
		phonelist.Search();
		
	}



}
