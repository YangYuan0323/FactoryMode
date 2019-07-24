package com.abstractfactory.commonfactory;

public class MysqlFactory implements SqlFactory {

	@Override
	public IUser createUser() {
		return new MysqlUser();
	}
}
