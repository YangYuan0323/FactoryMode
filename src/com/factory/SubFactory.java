package com.factory;

import com.Operation;
import com.Sub;

public class SubFactory implements Factory {

	@Override
	public Operation createOperation() {
		 System.out.println("��������");
		return new Sub();
	}

}
