/**
 * 
 * This class builds the computer's internal storage with a Hard Disk Drive
 * 
 */
package Build;

import Interfaces.Storage;
import enums.DiskType;


/**
 *
 * @author steveduarte
 */
public class HDDBuild implements Storage {

    // get method for returning the HD storage size in GB
    @Override
    public int getSize() {
        return 256;
    }

    // get method for returning the Disk Type. This disk type is taken from enum
    // DiskType and is of type HD.
    @Override
    public DiskType getDiskType() {
        return DiskType.HD;
    }
    
}
