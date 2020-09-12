/**
 * 
 * This is the "contract" that specifies the methods for setting the computer's 
 * exterior.
 * 
 */
package Interfaces;

import java.awt.Color;

/**
 *
 * @author steveduarte
 */
public interface Exterior {
    
    // method for getting the size of the display in inches
    int getSize();
    
    // method for setting the computer's case color
    Color getColor();
    
}
