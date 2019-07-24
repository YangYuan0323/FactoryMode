package com.factory;

import com.Add;
import com.Operation;

public class AddFactory implements Factory {

	@Override
	public Operation createOperation() {
		 System.out.println("¼Ó·¨ÔËËã");
		return new Add();
	}

}
