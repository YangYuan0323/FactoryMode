package com.factory;

import com.Div;
import com.Operation;

public class DivFactory implements Factory {

	@Override
	public Operation createOperation() {
		 System.out.println("��������");
		return new Div();
	}

}
