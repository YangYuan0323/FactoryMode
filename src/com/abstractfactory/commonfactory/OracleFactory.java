package com.abstractfactory.commonfactory;

public class OracleFactory implements SqlFactory {

	@Override
	public IUser createUser() {
		return new OracleUser();
	}
}
