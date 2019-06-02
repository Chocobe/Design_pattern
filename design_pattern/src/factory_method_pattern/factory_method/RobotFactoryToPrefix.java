package factory_method_pattern.factory_method;

// Ư�� ���ڿ��� ����Ͽ� ��ü�� �����ϴ� ���
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
