package factory_method_pattern.factory_method;

// class명을 사용하여 객체를 생성하는 방법
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
