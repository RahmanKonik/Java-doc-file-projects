

/**
 * this program give the information about math contain method
 * 
 * if user want to see the his input value is negative or positive, then he can see it by this program
 * 
 * i declare the variable as a parameter inside main function
 * 
 * 
 * @author Konik Rahman
 * 
 */


public class Math {

        /* 
         * this program return the absolute value of an int value
         * 
         * if int value is less than zero , it will be return the negative value
         * 
         * or int vale is greater than zero, it will be return the int value as a positive value
         * 
         */

    public static int abs(int a) {


        if( a < 0){
            return a * -1;

        } else{
            return a;
        }


        
    }
}