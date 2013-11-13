package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.UnaryOperation;

public class DivideBy2 extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "x/2";
	}

	@Override
	public float perform(float arg1) {
		// TODO Auto-generated method stub
		return arg1/2;
	}

}
