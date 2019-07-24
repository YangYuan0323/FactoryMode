package com.simplefactory;

import com.Add;
import com.Div;
import com.Mul;
import com.Operation;
import com.Sub;

public class EasyFactory {
	
	public static Operation createOperation(String name){
		
		Operation operationObj = null;
		
		switch (name) {
		case "+":
			operationObj = new Add();
			break;
		case "-":
			operationObj = new Sub();
			break;
		case "*":
			operationObj = new Mul();
			break;
		case "/":
			operationObj = new Div();
			break;
		}
		return operationObj;
	}

}
