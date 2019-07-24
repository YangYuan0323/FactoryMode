package com.factory;

import com.Operation;
import com.Sub;

public class SubFactory implements Factory {

	@Override
	public Operation createOperation() {
		 System.out.println("¼õ·¨ÔËËã");
		return new Sub();
	}

}
