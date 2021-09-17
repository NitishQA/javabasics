package oops_Polymorphism_MethodOverRiding;
/*
Method over Riding - 
    1-->More than one method should be of Same name
    2-->All the method should belong to different class
    3-->All the methods should have Same arguments
        a-->Number of arguments
        b-->Sequence of arguments
        c-->Type of arguments
    4-->Inheritance concept should be there    
    If all the 4 conditions are satisfied,then method overloading can be achieved 
    **/

class Animal { //Parent class
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal { //Child class extending Parent class
   public void move() {
      System.out.println("Dogs can walk and run");
   }
}

public class TestDog {

   public static void main(String args[]) {
      Animal a = new Animal();   // Animal reference and animal object
      Animal b = new Dog();   // Animal reference but Dog object

      a.move();   // runs the method in Animal class
      b.move();   // runs the method in Dog class
   }
}