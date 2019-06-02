package static_factory_method_pattern.testMethod;

// Character라는 클래스의 의미가 모호하기 때문에, 명시적으로 import했다.
import static_factory_method_pattern.static_factory_method.Character;
import static_factory_method_pattern.static_factory_method.UserCharacter;

public class Tester {
	public static void main(String[] args) {
		
		// UserCharacter의 생성자를 직접 사용하지 못하고, 정적 펙토리 메소드를 통해 생성
		Character user_1 = UserCharacter.createMale();
		Character user_2 = UserCharacter.createFemale();
		
		System.out.println(user_1.getState());
		System.out.println(user_2.getState());
	}
}
