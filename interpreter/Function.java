package interpreter;

import parser.FunctionStatement;

public class Function {
	private FunctionStatement statement;
	
	public Function (FunctionStatement statement) {
		this.statement = statement;
	}
	
	public FunctionStatement getStatement() {
		return statement;
	}
}