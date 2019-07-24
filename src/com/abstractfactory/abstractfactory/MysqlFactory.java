package com.abstractfactory.abstractfactory;

public class MysqlFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new MysqlUser();
	}

	@Override
	public ILogin createLogin() {
		return new MysqlLogin();
	}

}
