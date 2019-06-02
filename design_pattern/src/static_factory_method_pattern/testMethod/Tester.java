package static_factory_method_pattern.testMethod;

// Character��� Ŭ������ �ǹ̰� ��ȣ�ϱ� ������, ��������� import�ߴ�.
import static_factory_method_pattern.static_factory_method.Character;
import static_factory_method_pattern.static_factory_method.UserCharacter;

public class Tester {
	public static void main(String[] args) {
		
		// UserCharacter�� �����ڸ� ���� ������� ���ϰ�, ���� ���丮 �޼ҵ带 ���� ����
		Character user_1 = UserCharacter.createMale();
		Character user_2 = UserCharacter.createFemale();
		
		System.out.println(user_1.getState());
		System.out.println(user_2.getState());
	}
}
