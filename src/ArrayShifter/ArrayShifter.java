/**
 * Created by Norman Potts 000344657
 * MAR/20/2015
 */

package ArrayShifter;

import java.util.Scanner;

/** Class ArrayShifter
 * 
 *      Displays an array of 20 elements 1 to 20. Ask user how many positions 
 *      they would like to shift. Tells user that typing a non number will exit
 *      the program. With the number entered, shift the contents of the array
 *      in the shifter object. Accepts negatives, which allow the array to be 
 *      shifted in reverse.
 *
 * @author norman.potts
 */
public class ArrayShifter 
{
    public static void main( String[] args ) 
    {           
        int shiftAmount = 0;        
        Shifter shifter_obj = new Shifter(20);//Create Shifter object.
        boolean endloop = false;
        do 
        {
            shifter_obj.display();        
            System.out.println(" How many positions would you like to Shift? \n Typing non numbers exits program.");
            Scanner input = new Scanner( System.in);// Scans for keyboard input data
            String str = input.nextLine();          // Wait for nextLine of keyboard input.
            try                                     // Try and parse int...
            {
                shiftAmount = Integer.parseInt(str);
                shifter_obj.Shift(shiftAmount);    // Call shift method. 
            }
            catch(NumberFormatException e)            
            {
                endloop = true; // Yup end loop.
            }                                                            
            
        }while(endloop == false);
    
    }///End of main.
    
}/// End of Class ArrayShifter
