package com.abstractfactory.commonfactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SqlFactory sqlFactory = new MysqlFactory();
		IUser userOperator = sqlFactory.createUser();
		userOperator.insert(new User());
		userOperator.getUser(1);
	}

}
