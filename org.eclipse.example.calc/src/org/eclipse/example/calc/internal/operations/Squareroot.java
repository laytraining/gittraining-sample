package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.UnaryOperation;

public class Squareroot extends AbstractOperation implements UnaryOperation {

	@Override
	public String getName() {
		return "sqrt";
	}

	@Override
	public float perform(float arg1) {
		return (float) Math.sqrt(arg1);
	}

}
