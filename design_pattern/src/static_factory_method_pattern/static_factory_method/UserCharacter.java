package static_factory_method_pattern.static_factory_method;

public class UserCharacter extends Character {
	String sex;
	
	// 캡슐화된 생성자
	private UserCharacter(String _sex) {
		this.sex = _sex;
	}
	
	// 정적 펙토리 메소드
	public static UserCharacter createMale() {
		return new UserCharacter("Male");
	}
	
	// 정적 펙토리 메소드
	public static UserCharacter createFemale() {
		return new UserCharacter("Female");
	}
	
	public String getState() {
		return sex; 
	}
}
