package Basic0119;

abstract class PairMap {

    String keyArray []; //key ���� �����ϴ� �迭
	String valueArray []; //value ���� �����ϴ� �迭
	abstract String get(String key); //key ���� ���� value�� ����, ������ null ����
	abstract void put(String key, String value); //key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	abstract String delete(String key); //key ���� ���� ������(value�� �Բ�) ����. ������ value �� ����
	abstract int length(); //���� ����� ������ ���� ����
}
//���Ͱ��� �߻�Ŭ������ �ִٰ� ���������� 
//���� �߻�Ŭ������ �������̽��� �����Ͽ� �����ϴ� Dic Ŭ������ �ۼ��ϰ�.
//�Ʒ��� main �޼ҵ带 Ȱ���Ҽ� �ִ� Ŭ���� DicMain�� �ۼ��ϼ���
// -> ���ǻ��� : �ڵ� �ּ� �ʼ�
//public static void main(String[] args) {
//	Dic dic=new Dic(10);
//	dic.put("���ڵ�", "�ڹٽ�ũ��Ʈ");
//	dic.put("���ڵ�", "GoLang");
//	dic.put("������", "python"); 
//	dic.put("���ڵ�", "JAVA"); //���ڵ��� ���� JAVA�� ����
//	System.out.println("���ڵ��� ���� "+dic.get("���ڵ�"));
//	System.out.println("���ڵ��� ���� "+dic.get("���ڵ�"));
//	System.out.println("�������� ���� "+dic.get("������"));
//	dic.delete("���ڵ�"); //���ڵ� ������ ����
//	System.out.println("���ڵ��� ���� "+dic.get("���ڵ�")); //������ ������ ����
//}
//--���---
//���ڵ��� ���� JAVA
//���ڵ��� ���� GoLang
//�������� ���� python
//���ڵ��� ���� null

