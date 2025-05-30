package oop6TestCircleWithAccessors;
// TestCircleWithAccessors.java: Demonstrate private modifier
public class TestCircleWithAccessors {
  /** Main method */
  public static void main(String[] args) {
    // Create a Circle with radius 5.0
    CircleWithAccessors myCircle = new CircleWithAccessors(5.0);

    //System.out.println(myCircle.getRadius());
   // myCircle.radius=9;
    System.out.println("The area of the circle of radius "
      + myCircle.getRadius() + " is " + myCircle.findArea());
   
    //r u able to access radius of myCircle directly from object as below? why?
    //  System.out.println(myCircle.radius);
    
    // Increase myCircle's radius by 10%
    myCircle.setRadius(myCircle.getRadius() * 1.1);
    System.out.println("The area of the circle of radius "
      + myCircle.getRadius() + " is " + myCircle.findArea());
  }
}