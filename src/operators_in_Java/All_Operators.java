package operators_in_Java;

public class All_Operators {

	public static void main(String[] args) {
		/**

		 Java Operator Precedence

Unary		postfix	expr++ expr-- (First Operation then Increment/Decrement)
			prefix	++expr --expr +expr -expr ~ ! (First Increment/Decrement then Operation)

Arithmetic	multiplicative	* / %
			additive	+ -

Shift		shift	<< >> >>>

Relational	comparison	< > <= >= instanceof
			equality	== !=

Bitwise		bitwise AND	&
			bitwise exclusive OR	^
			bitwise inclusive OR	|

Logical		logical AND	&&
			logical OR	||

Ternary		ternary	? :

Assignment	assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=

		 **/
		All_Operators obj1 = new All_Operators();

//		obj1.Unary_operator();
//		obj1.Arithmetic_operator();
		obj1.Relational_Comparision_operator();
		obj1.Logical_operator1();
		obj1.Logical_operator2();
		obj1.Logical_operator3();



	}

	public void Unary_operator() {        /* Non Static Method */
		int x=10; 
		System.out.println("Unary Operator");
		System.out.println();
		
		System.out.println("Initially the value is: " +x);
		System.out.println();

		System.out.println(x++);//Here first operation, i.e. it will print 10, and when it goes to next line by making increment   
		// Here x = 11 

		System.out.println();

		System.out.println(++x);// Here first increment, i.e.++11 = 12, and when it goes to next line
		// Here x = 12

		System.out.println();

		System.out.println(x--);//Here first operation i.e. 12, and when it goes to next line
		// Here x = 11
		
		System.out.println(x);

		System.out.println(--x);//Here first decrement, i.e. --11 = 10
		System.out.println();
	}

	public void Arithmetic_operator() {

		/**** Arithmetic operators are +, -, *, /, %

		+ is Addition
		– is Subtraction
		 * is Multiplication
		/ is Division
		% is Modulus operator – it returns the remainder of an integer division ****/        


		int num1 = 100;
		float num2 = 51;
		System.out.println("Arithmetic Operator");
		System.out.println();

		System.out.println("Addition of two numbers is: "+(num1+num2));
		System.out.println("Substraction of two numbers is: "+(num1-num2));
		System.out.println("Multiplication of two numbers is: "+(num1*num2));
		System.out.println("Division of two numbers is: "+(num1/num2));
		System.out.println("Modulus of two numbers is: "+(num1%num2));//It returns the remainder
		System.out.println();

	}

	public void Relational_Comparision_operator() {

		int num1 = 100;
		int num2 = 50;

		System.out.println("Relational Operator");
		System.out.println();
		// if num1 is equal to num2 then it returns true
		System.out.println("num1 == num2 = " + (num1 == num2) );

		// if num1 is not equal to num2 then it returns true
		System.out.println("num1 != num2 = " + (num1 != num2) );

		// if num1 is greater than num2 then it returns true
		System.out.println("num1 > num2 = " + (num1 > num2) );

		// if num1 is less than num2 then it returns true
		System.out.println("num1 < num2 = " + (num1 < num2) );

		// if num1 is greater than or equal to num2 then it returns true
		System.out.println("num1 >= num2 = " + (num1 >= num2) );

		// if num1 is less than or equal to num2 then it returns true
		System.out.println("num1 <= num2 = " + (num1 <= num2) );

		// ! - NOT , If num1 is not equal to condition
		if(num1 != 100) {
			System.out.println("Number1 is not equal to 100");
			System.out.println();
		}
		if(num1 !=101) {
			System.out.println("Number1 is not  equal to 101 ");
			System.out.println();
		}
		
	}

	public void Logical_operator1() {
		boolean booleanVal1 = true;
		boolean booleanVal2 = false;
		
		System.out.println("Logical Operator1");
		System.out.println();

		// && - AND
		System.out.println("Output of AND is "+ (booleanVal1&&booleanVal2));
		// || - OR
		System.out.println("Output of OR is "+ (booleanVal1||booleanVal2));
		// ! - NOT
		System.out.println("Output of NOT is "+ (!booleanVal1));
		System.out.println();

	}
	public void Logical_operator2() {
		int x = 10;
		int y = 20;
		
		System.out.println("Logical Operator2");
		System.out.println();

		// && - Logical AND
		System.out.println("Output of AND is "+ (x<15 && x<y));
		
		// || - Logical OR
		System.out.println("Output of OR is "+ (x<15 || x<y));
	
		// ! - Logical Not
		System.out.println("Output of NOT is "+ (!(x==10)));
		System.out.println();
		


	}
	
	public void Logical_operator3() {
		int x = 10;
		int y = 20;
		
		
		System.out.println("Logical Operator3");
		System.out.println();

		// && - Logical AND
		System.out.println("Output of AND is "+ (x<15 && x<y));
		
		// || - Logical OR
		System.out.println("Output of OR is "+ (x<15 || x<y));
	
		// ! - Logical Not
		System.out.println("Output of NOT is "+ (!(x==10)));

	}

}



