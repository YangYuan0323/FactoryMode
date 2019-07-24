package com.abstractfactory.abstractfactory;

public class Test {
	
	public static void main(String[] args) {
		User user = new User();
		Login login = new Login();
		
		// 只需要确定实例化哪一个数据库访问对象给factory
		IFactory factory = new OracleFactory();
		 // 已与具体的数据库访问解除了耦合
		IUser userOperation = factory.createUser();
		userOperation.getUser(1);
		userOperation.insert(user);
		
		 // 已与具体的数据库访问解除了耦合
		ILogin loginOperation = factory.createLogin();
		loginOperation.insertLogin(login);
		loginOperation.getLogin(1);
		
		
	}
}
