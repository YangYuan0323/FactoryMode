package com.factory;

import com.Mul;
import com.Operation;

public class MulFactory implements Factory {

	@Override
	public Operation createOperation() {
		 System.out.println("�˷�����");
		return new Mul();
	}

}
