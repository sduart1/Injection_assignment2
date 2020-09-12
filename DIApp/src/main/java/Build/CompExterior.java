/**
 * 
 * This class implements the Exterior interface to build the computer's exterior.
 */
package Build;

import Interfaces.Exterior;
import java.awt.Color;

/**
 *
 * @author steveduarte
 */
public class CompExterior implements Exterior {

    // set the private local variable
    private Color color; 
    
    
    // constructor builds the exterior with injected color
    public CompExterior (Color colorValue) {
        this.color = colorValue;
    }
    
    // method for returning computer display size in inches
    @Override
    public int getSize() {
        return 15;
    }

    
    // method for getting the exterior color of the case
    @Override
    public Color getColor() {
        return Color.BLUE;
    }
    
    
}
