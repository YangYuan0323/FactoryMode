package com.abstractfactory.abstractfactory;

public class MysqlLogin implements ILogin {

	@Override
	public void insertLogin(Login login) {

        System.out.println("�� MySQL ��� Login �������һ������");

	}

	@Override
	public Login getLogin(int id) {
		System.out.println("ͨ�� uid �� MySQL ��� Login ��õ���һ������");
		return null;
	}

}
