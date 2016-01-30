/**
 * Answers question 2 of the lesson 3 exercises.
 */
public class Q2TrueOrFalse {}

/**
 * Part 1
 * 
 * Must every interface have at least 1 method?
 * 
 * FALSE!  An interface may have only a field, as below:
 */
interface interExample6{
    int integer1 = 0; // this is actually 'public' and 'static'
}

/**
 * Part 2
 * 
 * Interfaces can declare instance fields that an implementing class must also
 * declare.
 * 
 * FALSE! Interfaces only can declare 'static' fields whereas fields that can
 * be implemented must necessarily be 'instance' fields.
 */
public class implementExample1 implements interExample6{
    int integer1; // Error: this hides the field in the interface above.
}

/**
 * Part 3
 * 
 * Interfaces can declare constructor methods that require an implementing
 * class to provide constructors with given signatures.
 * 
 * FALSE! Interfaces cannot declare constructor methods as this would put
 * restrictions on the implementation of the implementing classes, which an
 * interface by definition does not do; the interface should not define any
 * aspect of the implementation.
 */
interface interExample7{
    void interExample7(int integer2);
}

/**
 * The following implementation shows that the method which attempts to emulate
 * a constructor in the interface cannot be implemented as a constructor.
 */
public class implementExample2 implements interExample7{
    @Override
    public void interExample7(int integer3){}; // not a constructor; the name
    //  of this method is different to the class name.
}