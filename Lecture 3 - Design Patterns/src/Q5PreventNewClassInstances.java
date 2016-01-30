/**
 * To prevent other programmers from construcing new instances of your class
 * you may create a Singleton as in the following pattern:
 * 
 */
public class Q5PreventNewClassInstances {
    
    /**
     * Create a private static and final field to hold your single object of
     * this class type.  Private stops other programmers accessing the field.
     * Static ensures that it is called for the class and not for separate
     * instances of this class.
     */
    private static Q5PreventNewClassInstances instance = null;
    
    /**
     * This protected constructor stops the instantiation of this class into
     * objects.
     */
    protected Q5PreventNewClassInstances(){}
    
    /**
     * The 'if' structure here ensures that the class can only be instantiated
     * a single time.
     */
    public static Q5PreventNewClassInstances getInstance(){
        if(instance == null){
            instance = new Q5PreventNewClassInstances();
        }
        return instance;
    }
}