# Static Factory Method Pattern
* Static Factory Method Pattern의 기능
		
		객체 생성(생성자)를 갭슐화 하는 기능을 갖는다.
		
* Static Factory Method Pattern의 적용 부분

		생성자를 오버로딩(over loading)하여 사용할 경우에 적합하다.
		
* Static Factory Method Pattern의 목적

		생성자를 사용하는 것 보다 가독성을 증가 시킨다.
		
		예를 들어, 케릭터 객체를 생성할 경우 "남성/여성"을 매개변수로 입력하여 생성자를 호출해야 한다고 가정하자.
		이 때, 생성자를 직접 사용할 경우는 매개변수의 값을 정확히 "남성" 또는 "여성"으로 입력해야 하지만,
		Static Factory Method Pattern을 사용할 경우, 해당 메소드만 호출하면 객체 생성이 가능하다.