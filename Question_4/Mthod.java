package Question_4;
/*
public class Mthod {
    
Question: Explain about an abstract method and an abstract class with an example.

Answer:
        Abstract Method: Abstract methods are those types of methods that don't require 
        implementation for its declaration. These methods don't have a body which means 
        no implementation. 

        A few properties of an abstract method are:

        (a): An abstract method in Java is declared through the keyword �abstract�.
        (b): While the declaration of the abstract method, the abstract keyword has to
             be placed before the name of the method.
        (c): There is no body in an abstract method, only the signature of the method is present.
        (d): An abstract method in Java doesn�t have curly braces, but the end of the method will
             have a semicolon (;)     

Example:
            public abstract class Car
            {

			    private String model;

			    private String color;

			    private int year;

			    public abstract double computePrice();
              }  
 If derived classes don�t implement the abstract methods, it would result in abstract
 classes that cannot be instantiated.  


 Abstract Class: A class which is declared as abstract is known as an abstract class.
                 It can have abstract and non-abstract methods. It needs to be extended 
                 and its method implemented. It cannot be instantiated.

        A few properties of an abstract class are:

        (a): An abstract class must be declared with an abstract keyword.
        (b): It can have abstract and non-abstract methods.
        (c): It cannot be instantiated.
        (d): It can have constructors and static methods also.
        (e): It can have final methods which will force the subclass not to change the 
             body of the method

    Example:
              abstract class Bike
              {  
			    abstract void run();  
			    }  

			class Honda extends Bike{

			void run(){
			System.out.println("running safely");
			 }  

		  public static void main(String args[]){  
		   Bike obj = new Honda();  
			 obj.run();  
           }  
      }    

    
}
*/