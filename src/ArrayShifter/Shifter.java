/**
 * Created by Norman Potts 000344657
 * MAR/20/2015
 */

package ArrayShifter;

/** Class Shifter
 *  
 *      The constructor creates the integer array with the given size. The 
 *      method Shift allow the array to be re-assigned based on the given amount
 *      to shift by. The method display prints out the array.
 * 
 * @author norman.potts
 */
public class Shifter 
{             
    private static int Data[];  /// The array being shifted.
    private static int DataSize; /// The size of the array. 
    
    
    /** Constructor Shifter
     *      Receives the size parameter and uses it to build an array of numbers
     *      the size of size.
     * @param size 
     */
    public Shifter( int size ){
        Data = new int[size]; //Create new interger array.
        DataSize = size;
        //Reverse loop...
        for( int i = size-1; i >=0; i--)  
        {
            Data[i] = i+1;
        }        
    }/// End of Constructor Shifter.
    
    
    
    
    /** Method Shift
     *      Shifts the Data array contents.
     * 
     * @param howManyPositions
     */
    public void Shift( int howManyPositions )
    {        
        // Make temporary copy
        int[] temp =  new int[DataSize];
        for(int i = 0; i < DataSize; i++)
        {
            int item = Data[i];
            temp[i] = item;            
        }
        
        int xelement;
        //Shift over array items.
        for(int i = 0; i < DataSize; i++)
        {
            int item = temp[i];
            
            if (howManyPositions >= 0 )
            {            
                xelement = howManyPositions + i ;                
                xelement = (xelement % (DataSize));                                                
            }
            else
            {   // Negative.
                xelement = howManyPositions + i;
                xelement = (xelement % (DataSize));                 
                if( xelement < 0 )
                {
                    xelement =  xelement + DataSize ;                
                }                                                                
            }                                   
            Data[xelement] = item;
            
        }//End of for loop, items have been shifted.                
        
    }/// End of method Shift
    
    
    
    
    /** Method display
     *      Displays the contents of the Data array.
     * 
     */
    public void display()
    {
        System.out.println(" Displaying Data Array...");
        for( int i = DataSize -1; i >= 0; i--)
        {            
            System.out.println(" Data["+i+"] is "+Data[i]+" ");        
        }    
    }/// End of Method display
            
    
}/// End of Class Shifter
