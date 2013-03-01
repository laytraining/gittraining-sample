package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.UnaryOperation;

public class Absolut extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		return "abs";
	}

	@Override
	public float perform(float arg1) {
		return Math.abs(arg1);
	}

}
