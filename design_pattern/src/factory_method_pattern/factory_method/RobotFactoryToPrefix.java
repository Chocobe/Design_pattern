package factory_method_pattern.factory_method;

// 특정 문자열을 사용하여 객체를 생성하는 방법
public class RobotFactoryToPrefix extends RobotFactory {
	public Robot createRobot(String _name) {
		switch(_name) {
			case "super" :
				return new SuperRobot();
				
			case "power" :
				return new PowerRobot();
		}
		
		return null;
	}
}
