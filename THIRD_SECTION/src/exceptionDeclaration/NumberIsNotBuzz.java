package exceptionDeclaration;

public class NumberIsNotBuzz extends RuntimeException {
          @Override
          public String getMessage() {
        	  return "The Number is Not Buzz";
          }
}
