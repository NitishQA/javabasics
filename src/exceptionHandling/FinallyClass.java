package exceptionHandling;

/*
 finally block in Java can be used to put "cleanup" code such as closing a file, closing connection, etc.The important statements to be printed can be placed in the finally block.

 */

public class FinallyClass {

	public static void main(String[] args) {
//		finallyBlock1();
		finallyBlock2();

	}
	//When an exception occur but not handled by the catch block
	public static void finallyBlock1() {
		 try {    
			  
		        System.out.println("Inside the try block");  
		          
		        //below code throws divide by zero exception  
		       int data=25/0;    
		       System.out.println(data);    
		      }    
		      //cannot handle Arithmetic type exception  
		      //can only accept Null Pointer type exception  
		      catch(NullPointerException e){  
		        System.out.println("The e is : " +e);  
		      }   
		  
		      //executes regardless of exception occured or not   
		      finally {  
		        System.out.println("finally block is always executed");  
		      }    
		  
		      System.out.println("rest of the code...");    
	}
	
	//When an exception occurs and is handled by the catch block
		public static void finallyBlock2() {
			try {    
				  
		        System.out.println("Inside try block");  
		  
		        //below code throws divide by zero exception  
		       int data=25/0;    
		       System.out.println(data);    
		      }   
		  
		      //handles the Arithmetic Exception / Divide by zero exception  
		      catch(ArithmeticException e){  
		        System.out.println("Exception handled");  
		        System.out.println("The e is : "+e);  
		      }   
		  
		      //executes regardless of exception occured or not   
		      finally {  
		        System.out.println("finally block is always executed");  
		      }    
		  
		      System.out.println("rest of the code...");       
		}

}
