/**
 * 
 * 
 * Testing class to test different classes in my main build. This class will
 * build a computer and insert different values to make sure the build is correct.
 * 
 */
package Test;

import Build.CompExterior;
import Build.Computer;
import Build.HDDBuild;
import Interfaces.Exterior;
import Interfaces.Storage;
import java.awt.Color;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author steveduarte
 */
public class CompTest {
    
    // set the local variables
    Storage storage;
    Color color;
    Exterior exterior; 
    Computer computer;
    
    // setUp method to pass in the values to my computer object
    @Before
    public void setUp(){
        this.storage = new HDDBuild();
        this.color = Color.RED;
        Exterior exterior = new CompExterior(color);
        this.computer = new Computer(storage, exterior);
    }
    
    // tests to see if the computer was built correctly and nothing is null
    @Test
    public void testCompConstruction(){
        assertNotNull ("testCompConstruction failed", computer);
    }
    
    // tests to see if the storage is being built correctly. 
    @Test
    public void getStorage(){
        assertEquals("Verified Storage is correct", this.storage, computer.getStorage());
    }
    
    
}
