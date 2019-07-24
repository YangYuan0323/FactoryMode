package com.abstractfactory.abstractfactory;

public class OracleFactory implements IFactory {

	@Override
	public IUser createUser() {
		return new OracleUser();
	}

	@Override
	public ILogin createLogin() {
		return new OracleLogin();
	}

}
