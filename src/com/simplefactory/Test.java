package com.simplefactory;

import com.Operation;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Operation add = EasyFactory.createOperation("+");
		Operation sub = EasyFactory.createOperation("-");
		Operation mul = EasyFactory.createOperation("*");
		Operation div = EasyFactory.createOperation("/");
		try {
			System.out.println(add.getResult(1,1));
			System.out.println(sub.getResult(1,1));
			System.out.println(mul.getResult(1,1));
			System.out.println(div.getResult(1,1));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
