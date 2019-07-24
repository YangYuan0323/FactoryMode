package com.factory;

import com.Operation;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Factory addFactory = new AddFactory();
			Factory subFactory = new SubFactory();
			Factory mulFactory = new MulFactory();
			Factory divFactory = new DivFactory();
			
			Operation add = addFactory.createOperation();
			Operation sub = subFactory.createOperation();
			Operation mul = mulFactory.createOperation();
			Operation div = divFactory.createOperation();
			
			
			System.out.println(add.getResult(1,1));
			System.out.println(sub.getResult(1,1));
			System.out.println(mul.getResult(1,1));
			System.out.println(div.getResult(1,1));
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
