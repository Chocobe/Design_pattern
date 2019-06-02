package factory_method_pattern.testMethod;

import factory_method_pattern.factory_method.*;

public class Tester {
	public static void main(String[] args) {
		
		// 개체 생성 (SuperRobot 또는 PowerRobot의 생성자를 직접 사용할 수 없고,
		//		RobotFactoryToPrefix를 통해 생성)
		RobotFactoryToPrefix robotFactoryToPrefix = new RobotFactoryToPrefix();
		Robot robot_1 = robotFactoryToPrefix.createRobot("super");
		Robot robot_2 = robotFactoryToPrefix.createRobot("power");
		
		System.out.println(robot_1.getName());
		System.out.println(robot_2.getName());
		
		System.out.println("---------------------");
		
		// 개체 생성 (SuperRobot 또는 PowerRobot의 생성자를 직접 사용할 수 없고, 
		//		RobotFactoryClassName을 통해 생성)
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
