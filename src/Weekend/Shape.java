package Weekend;


//문제: 도형의 면적을 계산하는 프로그램을 작성해야 합니다. 
//도형은 Shape 추상 클래스를 상속받아 구현해야 합니다. 
//각 도형은 면적을 계산하는 calculateArea() 메서드를 가져야 합니다. 
//프로그램은 다양한 도형의 면적을 계산하여 출력해야 합니다.
//
//요구사항:
//Shape 추상 클래스는 추상 메서드 calculateArea()를 가져야 합니다.
//Shape 추상 클래스를 상속받아 Circle, Rectangle, Triangle 클래스를 작성해야 합니다.
//Circle 클래스는 반지름을 멤버 변수로 가지며, calculateArea() 메서드를 구현하여 원의 면적을 계산합니다.
//Rectangle 클래스는 가로와 세로의 길이를 멤버 변수로 가지며, calculateArea() 메서드를 구현하여 사각형의 면적을 계산합니다.
//Triangle 클래스는 밑변과 높이를 멤버 변수로 가지며, calculateArea() 메서드를 구현하여 삼각형의 면적을 계산합니다.
//프로그램은 다양한 도형의 면적을 계산하여 출력해야 합니다.

abstract class Shape {
	abstract double calculateArea();
}
