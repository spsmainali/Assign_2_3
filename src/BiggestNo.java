class CalculateBiggest{ //class defination
	CalculateBiggest(int a, int b, int c){ 					// defining a constructor for calculation of biggest among three
		if(a>b){											// checking the biggest  among two
			if(a>c)											// checking the biggest with third
				System.out.println(a);						// Printing the biggest
		}
		else if(b>c)
			System.out.println(b);							// Printing the biggest
		else 
			System.out.println(c);							// Printing the biggest
	}
}

public class BiggestNo { //class declaration for finding biggest no. among 3 nos
	public static void main(String[] agrs){
		int num1 = 11; 
		int num2 = 10;
		int num3 =5;
		CalculateBiggest a = new CalculateBiggest(num1,num2,num3); // constructor call or object declare and define
		
		
	}
}
