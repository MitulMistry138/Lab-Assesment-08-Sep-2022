/*program :- Java program to find Quotient and Remainder(take input).
@author:- Mitul Mistry
@date - 08-Sep-2022 (Lab assesment) 
*/
import static java.lang.System.*;  //importing package java .lang 


class QuotientRemainder   // declaring class name as QuotientRemainder

{
	
public static void main(String ...args)  // command line 

{
	
	int divisor= Integer.parseInt(args[0]);  // taking input from user
	int divident= Integer.parseInt(args[1]);  // takng the second input from user
	float q= (float)(divident/divisor);       // type casting float for quotient  
	float r= (float)(divident%divisor);			// type casting float for remainder
	
	out.println("The Quotient is :- " +q);  // printing the quotient 
	out.println("The remainder is :" +r );   // printing the remainder 
	
	} // end of method
	
}// end of class
