package exceptionHandling;

public class NestedTryCatchClass {

	public static void main(String[] args) {
		nestedTryMethod1();

	}
	
	public static void nestedTryMethod1() {
		//outer try block   
		  try{    
		  //inner try block 1  
		    try{    
		     System.out.println("going to divide by 0");    
		     int b =39/0;    
		   }  
		    //catch block of inner try block 1  
		    catch(ArithmeticException e)  
		    {  
		      System.out.println("The e is : "+e);  
		    }    
		       
		    
		    //inner try block 2  
		    try{    
		    int a[]=new int[5];    
		  
		    //assigning the value out of array bounds  
		     a[5]=4;    
		     }  
		  
		    //catch block of inner try block 2  
		    catch(ArrayIndexOutOfBoundsException e)  
		    {  
		       System.out.println("The e is : "+e);  
		    }    
		  
		      
		    System.out.println("other statement");    
		  }  
		  //catch block of outer try block  
		  catch(Exception e)  
		  {  
		    System.out.println("handled the exception (outer catch)" +e);  
		  }    
		    
		  System.out.println("normal flow..");    
	}

}
