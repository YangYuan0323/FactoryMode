package com.abstractfactory.abstractfactory;

public class OracleLogin implements ILogin {

	@Override
	public void insertLogin(Login login) {
		System.out.println("�� Oracle ��� Login �������һ������");

	}

	@Override
	public Login getLogin(int id) {
		 System.out.println("ͨ�� uid �� Oracle ��� Login ��õ���һ������");
		return null;
	}

}
