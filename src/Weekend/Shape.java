package Weekend;


//����: ������ ������ ����ϴ� ���α׷��� �ۼ��ؾ� �մϴ�. 
//������ Shape �߻� Ŭ������ ��ӹ޾� �����ؾ� �մϴ�. 
//�� ������ ������ ����ϴ� calculateArea() �޼��带 ������ �մϴ�. 
//���α׷��� �پ��� ������ ������ ����Ͽ� ����ؾ� �մϴ�.
//
//�䱸����:
//Shape �߻� Ŭ������ �߻� �޼��� calculateArea()�� ������ �մϴ�.
//Shape �߻� Ŭ������ ��ӹ޾� Circle, Rectangle, Triangle Ŭ������ �ۼ��ؾ� �մϴ�.
//Circle Ŭ������ �������� ��� ������ ������, calculateArea() �޼��带 �����Ͽ� ���� ������ ����մϴ�.
//Rectangle Ŭ������ ���ο� ������ ���̸� ��� ������ ������, calculateArea() �޼��带 �����Ͽ� �簢���� ������ ����մϴ�.
//Triangle Ŭ������ �غ��� ���̸� ��� ������ ������, calculateArea() �޼��带 �����Ͽ� �ﰢ���� ������ ����մϴ�.
//���α׷��� �پ��� ������ ������ ����Ͽ� ����ؾ� �մϴ�.

abstract class Shape {
	abstract double calculateArea();
}