
public class SimpleArithmetic {

	public int add(int number1, int number2){		 
		return number1+number2;
	}
 
	public int sub(int number1, int number2){ 
		return number1-number2;
	}
 
	public int multi(int number1, int number2){ 
		return number1*number2;
	}
 
	public int div(int number1, int number2){ 
		if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
		else
		return number1/number2;
	}
 
	public double divDouble(double number1, double number2){ 
		if (number2 == 0) {
	         throw new IllegalArgumentException("Cannot divide by 0!");
	      }
		else
		return (double)number1%number2;
	}
	
	
}
