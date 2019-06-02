package static_factory_method_pattern.static_factory_method;

public class UserCharacter extends Character {
	String sex;
	
	// ĸ��ȭ�� ������
	private UserCharacter(String _sex) {
		this.sex = _sex;
	}
	
	// ���� ���丮 �޼ҵ�
	public static UserCharacter createMale() {
		return new UserCharacter("Male");
	}
	
	// ���� ���丮 �޼ҵ�
	public static UserCharacter createFemale() {
		return new UserCharacter("Female");
	}
	
	public String getState() {
		return sex; 
	}
}
