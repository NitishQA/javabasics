package oops_Interface;

//Interface does not have method body
//Implements keyword is used

interface Drawable{  

	void draw();  

}  

//Implementation: by second user  
class Rectangle implements Drawable{ 

	public void draw(){
		
		System.out.println("drawing rectangle");
	}  
}  

class Circle implements Drawable{  
	public void draw(){
		
		System.out.println("drawing circle");}  
}  

//Using interface: by third user  
public class TestInterface1{  

	public static void main(String args[]){  
		Drawable d=new Circle();  
		d.draw();  
	}
}
