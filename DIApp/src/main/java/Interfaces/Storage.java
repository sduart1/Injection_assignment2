/**
 * 
 * This is the contract that sets the methods for the storage type in the computer. 
 * 
 */
package Interfaces;

import enums.DiskType;

/**
 *
 * @author steveduarte
 */
public interface Storage {
    
    // method for getting the HD space in GB
    int getSize();
    
    
    // method for getting the type of disk drive to be installed
    DiskType getDiskType();
    
}
