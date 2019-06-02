# Factory Method Pattern

* Factory Method Pattern의 기능

		생성자를 서브 클래스에 위임하는 패턴이다.
		
* Factory Method Pattern의 적용 부분
		
		생성자가 오버로딩으로 작성되는 경우에 적합하다.
		
* Factory Method Pattern의 목적

		클래스간의 결합도를 낮추기 위함이다.
		결합도를 낮춘다는 것은, 클래스의 변경점이 다른 클래스에 미치는 영향력이 적다는 뜻이다.
		
		객체 생성을 직접적으로 할 수 없고, 서브 클래스를 통해서만 가능하기 때문에
		효율적인 코드 제어가 가능하고, 의존성을 제거하게 된다.