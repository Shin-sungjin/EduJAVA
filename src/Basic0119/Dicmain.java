package Basic0119;

public class Dicmain {
	public static void main(String[] args) {
		Dic dic=new Dic();
		dic.put("���ڵ�", "�ڹٽ�ũ��Ʈ");
		dic.put("���ڵ�", "GoLang");
		dic.put("������", "python"); 
		dic.put("���ڵ�", "JAVA"); //���ڵ��� ���� JAVA�� ����
		System.out.println("���ڵ��� ���� "+dic.get("���ڵ�"));
		System.out.println("���ڵ��� ���� "+dic.get("���ڵ�"));
		System.out.println("�������� ���� "+dic.get("������"));
		dic.delete("���ڵ�"); //���ڵ� ������ ����
		System.out.println("��`�ڵ��� ���� "+dic.get("���ڵ�")); //������ ������ ����
		
		System.out.println("");
		Dic2 dic2=new Dic2(10);
		dic2.put("���ڵ�", "�ڹٽ�ũ��Ʈ");
		dic2.put("���ڵ�", "GoLang");
		dic2.put("������", "python"); 
		dic2.put("���ڵ�", "JAVA"); //���ڵ��� ���� JAVA�� ����
		System.out.println("���ڵ��� ���� "+dic2.get("���ڵ�"));
		System.out.println("���ڵ��� ���� "+dic2.get("���ڵ�"));
		System.out.println("�������� ���� "+dic2.get("������"));
		dic2.delete("���ڵ�"); //���ڵ� ������ ����
		System.out.println("���ڵ��� ���� "+dic2.get("���ڵ�")); //������ ������ ����
	}
}
