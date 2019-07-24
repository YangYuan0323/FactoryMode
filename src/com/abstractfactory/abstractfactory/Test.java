package com.abstractfactory.abstractfactory;

public class Test {
	
	public static void main(String[] args) {
		User user = new User();
		Login login = new Login();
		
		// ֻ��Ҫȷ��ʵ������һ�����ݿ���ʶ����factory
		IFactory factory = new OracleFactory();
		 // �����������ݿ���ʽ�������
		IUser userOperation = factory.createUser();
		userOperation.getUser(1);
		userOperation.insert(user);
		
		 // �����������ݿ���ʽ�������
		ILogin loginOperation = factory.createLogin();
		loginOperation.insertLogin(login);
		loginOperation.getLogin(1);
		
		
	}
}
