package exceptionHandling;

//Exception handling is done so that the program should not stop in middle due to any exception.
/*
 The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.

 Throwable class is the root class of Java Exception hierarchy inherited by two subclasses: Exception and Error.

 1) Checked Exception
The classes that directly inherit the Throwable class except RuntimeException and Error are known as checked exceptions. 
For example, IOException, SQLException, etc. Checked exceptions are checked at compile-time.

2) Unchecked Exception
The classes that inherit the RuntimeException are known as unchecked exceptions. For example, ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException, etc. 
Unchecked exceptions are not checked at compile-time, but they are checked at runtime.

3) Error
Error is irrecoverable. Some example of errors are OutOfMemoryError, VirtualMachineError, AssertionError etc.

try - 	The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. 
The try block must be followed by either catch or finally.

catch - The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. 
It can be followed by finally block later.

finally	- The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.

throw - The "throw" keyword is used to throw an exception.

throws - The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. 
It doesn't throw an exception. It is always used with method signature.

 */

public class TryCatchClass1 {

	public static void main(String[] args) {
//		ArithmeticExpection();
//		nullPointerException();
		arrayIndex();
//		multiTryCatch1();
//		multiTryCatch2();
//		multiTryCatch3();


	}

	public static void ArithmeticExpection() {
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
			System.out.println("a/b is : "+c);

		}
		catch (Exception e) {
			System.out.println("The e is : "+e);

		}

		System.out.println("This program should not be stopped because of ArithmeticExpection");
	}

	public static void nullPointerException() {
		try {
			String s=null;	
			System.out.println(s.length());
			
		}
		catch (Exception e) { 
			System.out.println("The e is :" +e);//NullPointerException 
		}
		System.out.println("This program should not be stopped because of null Pointer Exception");
	}
	
	public static void arrayIndex() {
		 try  
	        {  
	        int arr[]= {1,3,5,7};  
	        System.out.println(arr[5]); //may throw exception   
	        }  
	            // handling the array exception  
	        catch(ArrayIndexOutOfBoundsException e)  
	        {  
	            System.out.println("The e is : "+e);  
	        }  
	        System.out.println("rest of the code");  
	    } 
	
	
	public static void multiTryCatch1() {
		
		 try{    
             int a[]=new int[5];    
             a[5]=30/0;    
            }    
            catch(ArithmeticException e)  
               {  
                System.out.println("Arithmetic Exception occurs");  
               }    
            catch(ArrayIndexOutOfBoundsException e)  
               {  
                System.out.println("ArrayIndexOutOfBounds Exception occurs");  
               }    
            catch(Exception e)  
               {  
                System.out.println("Parent Exception occurs");  
               }             
            System.out.println("rest of the code");    
 
	}
	public static void multiTryCatch2() {
		
		try{    
            int a[]=new int[5];    
            
            System.out.println(a[10]);  
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");      

	}
public static void multiTryCatch3() {
		
	  try{    
          String s=null;  
          System.out.println(s.length());  
         }    
         catch(ArithmeticException e)  
            {  
             System.out.println("Arithmetic Exception occurs");  
            }    
         catch(ArrayIndexOutOfBoundsException e)  
            {  
             System.out.println("ArrayIndexOutOfBounds Exception occurs");  
            }    
         catch(Exception e)  
            {  
             System.out.println("Parent Exception occurs");  
            }             
         System.out.println("rest of the code");   

	}
}
