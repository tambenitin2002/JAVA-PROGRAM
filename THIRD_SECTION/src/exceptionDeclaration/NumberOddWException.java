package exceptionDeclaration;

import java.util.Scanner;

public class NumberOddWException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Number is not divisible by 3";
	}
	

}

