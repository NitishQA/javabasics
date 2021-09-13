package syntax_DataType;

public class SyntaxNamingconventionsClass1 {
	public static void main(String[] args) {
		/* 
		(1) A class should always start with an uppercase first letter. 

		(2) Java is case-sensitive: "MyClass" and "myclass" has different meaning.
		    The name of the java file must match the class name, When saving the file, 
		    save it using the class name and add ".java" to the end of the filename

		(3) just remember that every Java program has a class name which must match the filename, 
		    and that every program must contain the main() method. 

		(4) Class Names − For all class names the first letter should be in Upper Case. 
		    If several words are used to form a name of the class, each inner word's first letter 
		    should be in Upper Case.
		    Example: class MyFirstJavaClass 

		(4) Method Names − All method names should start with a Lower Case letter. 
		    If several words are used to form the name of the method, 
		    then each inner word's first letter should be in Upper Case.
		    Example: public void myMethodName()
		    Example - 
		    class Employee  
			{  
			//method  
			void draw()  
			{  
			//code snippet  
			}  
			} 

		(5) Interface
            It should start with the Upper case letter.
			It should be an adjective such as Runnable, Remote, ActionListener.
			Use appropriate words, instead of acronyms.
			Example: -
			interface Printable  
			{  
			//code snippet  
			} 
			
		(6)	Variable
			It should start with a lowercase letter such as id, name.
			It should not start with the special characters like & (ampersand), $ (dollar), _ (underscore).
			If the name contains multiple words, start it with the lowercase letter followed by an uppercase letter such as firstName, lastName.
			Avoid using one-character variables such as x, y, z.
			Example :-
			  class Employee  
			{  
			//variable  
			int id;  
			//code snippet  
			}  
		
		(7) Package
			It should be a lowercase letter such as java, lang.
			If the name contains multiple words, it should be separated by dots (.) such as java.util, java.lang.
			Example :-
			package com.javatpoint; //package  
			class Employee  
			{  
			//code snippet  
			}  
			
	    (8) Constant
			It should be in uppercase letters such as RED, YELLOW.
			If the name contains multiple words, it should be separated by an underscore(_) such as MAX_PRIORITY.
			It may contain digits but not as the first letter.
			Example :-
			class Employee  
			{  
			//constant  
			 static final int MIN_AGE = 18;  
			//code snippet  
			}  	

        (9) CamelCase in java naming conventions
			Java follows camel-case syntax for naming the class, interface, method, and variable.
			
			If the name is combined with two words, the second word will start with Uppercase letter
			always such as actionPerformed(), firstName, ActionEvent, ActionListener, etc.
			
		(10) Most importantly, identifiers are case sensitive.

			Examples of legal identifiers: age, $salary, _value, __1_value.
			Examples of illegal identifiers: 123abc, -salary.	

		 */

	}

}
