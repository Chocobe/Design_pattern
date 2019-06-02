package factory_method_pattern.testMethod;

import factory_method_pattern.factory_method.*;

public class Tester {
	public static void main(String[] args) {
		
		// ��ü ���� (SuperRobot �Ǵ� PowerRobot�� �����ڸ� ���� ����� �� ����,
		//		RobotFactoryToPrefix�� ���� ����)
		RobotFactoryToPrefix robotFactoryToPrefix = new RobotFactoryToPrefix();
		Robot robot_1 = robotFactoryToPrefix.createRobot("super");
		Robot robot_2 = robotFactoryToPrefix.createRobot("power");
		
		System.out.println(robot_1.getName());
		System.out.println(robot_2.getName());
		
		System.out.println("---------------------");
		
		// ��ü ���� (SuperRobot �Ǵ� PowerRobot�� �����ڸ� ���� ����� �� ����, 
		//		RobotFactoryClassName�� ���� ����)
		RobotFactoryToClassName robotFactoryToClassName = new RobotFactoryToClassName();
		Robot robot_3 = robotFactoryToClassName.createRobot(
				"factory_method_pattern.factory_method.SuperRobot"
		);
		Robot robot_4 = robotFactoryToClassName.createRobot(
				"factory_method_pattern.factory_method.PowerRobot"
		);
		
		System.out.println(robot_3.getName());
		System.out.println(robot_4.getName());
	}
}
