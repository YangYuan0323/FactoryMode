package com.abstractfactory.abstractfactory;

public class MysqlUser implements IUser {

	@Override
	public void insert(User user) {
		  System.out.println("��mysql�е�user���в���һ��Ԫ��");

	}

	@Override
	public User getUser(int uid) {
		  System.out.println("��mysql�е�user��õ�idΪ"+uid+"��һ������");
		return null;
	}

}
