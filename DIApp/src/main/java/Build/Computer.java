/**
 * 
 * This is a class used to build a computer. Computer constructor uses 
 * Dependency injection to build the object.
 * 
 */
package Build;

import Interfaces.Exterior;
import Interfaces.Storage;

/**
 *
 * @author steveduarte
 */
public class Computer {
    
    // set private variables
    private Storage storage;
    private Exterior exterior;
    
    
    // inject the dependencies into the constructor
    public Computer(Storage storage, Exterior exterior){
        this.storage = storage;
        this.exterior = exterior;
    }
    
    
    // getter method for the storage variable
    public Storage getStorage(){
        return storage;
    }
    
    // getter method for the exterior variable
    public Exterior getExterior(){
        return exterior;
    }
}
