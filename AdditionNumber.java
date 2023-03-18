
import java.io.*;

/**
 * 
 * this program is displaying the summation of two number
 * and print it
 * @param int a passing the first value
 * @param b is passing the second value
 * @return return the sum of two passing values
 *  
 * @author Konik Rahman
 * @since 18/0372023
 * 
  */


public class AdditionNumber {

    public int additionNumber(int a, int b){
        return a + b;
    }

    /** 
     * using a function for addition the two number when main function call this function
     * 
     * passing the two value inside the parameter 
     * 
     * @expection IOexpection on input error
     */

    public static void main (String agrs[]) throws IOException{

        AdditionNumber number = new AdditionNumber();

        int summation = number.additionNumber(10, 30);

        System.out.println("The summation of two number is : "+ summation);
    }
    
}
