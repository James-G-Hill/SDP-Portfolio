/**
 * Answers for the lesson 3 exercises, question 1 follow.
 * Three differences between abstract classes and interfaces in Java 8.
 */
public class Q1AbstractClassesAndInterfaces {}

/**
 * Difference 1
 * 
 * Classes can implement multiple interfaces, so the following implementation
 * of 2 interfaces is acceptable:
 */
interface interExample1{}
interface interExample2{}

public class interfaceExample implements interExample1, interExample2 {}

/**
 * Whereas 2 abstract classes cannot be extended by a single class, so the
 * following example would not be acceptable:
 */
abstract class absExample1{}
abstract class absExample2{}

public class abstractClassExample extends absExample1, absExample2 {} // Error!



/**
 * Difference 2
 * 
 * With abstract classes you can define fields that are not static and final, so
 * the following is acceptable:
 */
abstract class absExample3{
    private int privInt1;
}

/**
 * Whereas interfaces cannot declare fields that are neither static or final so
 * the following is not acceptable:
 */
interface interExample3{
    private int privInt2; // Error!
}

/**
 * An field can only be entered into an interface with static and final:
 */
interface interExample4{
    static final int privInt3 = 1;
}



/**
 * Difference 3
 * 
 * An abstract class can contain a private method, so the following is
 * acceptable:
 */
abstract class absExample4{
    private void internalMethod1(){};
}

/**
 * Whereas all interface methods are automatically public and the following
 * would not be acceptable:
 */
interface interExample5{
    private void internalMethod2(); // Error!
}