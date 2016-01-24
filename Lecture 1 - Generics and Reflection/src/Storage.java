/**
 * Storage class provided by Birkbeck DCS.
 * 
 * @author James
 */
class Storage<T> {
    
    T x;
    
    public void setValue(T value){
        x = value;
    }
    
    public T getValue(){
        return x;
    }
    
}