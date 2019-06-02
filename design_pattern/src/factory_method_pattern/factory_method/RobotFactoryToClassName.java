package factory_method_pattern.factory_method;

// class���� ����Ͽ� ��ü�� �����ϴ� ���
public class RobotFactoryToClassName extends RobotFactory {
	public Robot createRobot(String _className) {
		try {
			Class<?> temp_class = Class.forName(_className);
			Object temp_object = temp_class.newInstance();
			return (Robot)temp_object;
			
		} catch (Exception e) {
			return null;
		}
	}
}
