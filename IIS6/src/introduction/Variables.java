package introduction;

public class Variables {

	public static void main(String[] args) {
		
		double firstNumber;
		firstNumber = 1;
		double secondNumber = 5;
		int result = (int) (firstNumber / secondNumber);
		System.out.println(result);
		
		double resultDouble = firstNumber / secondNumber;
		System.out.println(resultDouble);
		
		boolean alwaysTrue = true;
		boolean secondBoolean = false;
		System.out.println(alwaysTrue && secondBoolean);
		System.out.println(alwaysTrue || secondBoolean);
		
		String name = "Petar";
		String lastName = "Petrović";
		System.out.println(name + " " + lastName + " Njegoš");
		
		// IF - ELSE blok
		if (firstNumber > 0) 
			System.out.println("Number is positive.");
		else if (firstNumber < 0)
			System.out.println("Number is negative.");
		else
			System.out.println("Number is equal to zero.");
		
		// WHILE petlja
		int i = 1;
		System.out.println("Ispisati brojeve uz WHILE od 1 do 10");
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		// 1. ZADATAK
		
		System.out.println("Pomocu while 5!");
		i = 5;
		int factorial = 1;
		while (i > 0) {
			factorial = factorial * i;
			i--;
		}
		System.out.println("while 5! = " + factorial);
		
		// 2. ZADATAK
		// DO WHILE
		System.out.println("do while 5!");
		i = 5;
		factorial = 1;
		do {
			// factorial = factorial * i;
			factorial *= i;
			i--;
		} while (i>=1);
		System.out.println("do while 5! = " + factorial);
		
		// 3. ZADATAK
		// FOR
		//System.out.println("Pomocu for ispisati neparne brojeve od 1 do 10");
		for(i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			System.out.println("Number " + i + " is odd.");
		}
		
		
	}

}
