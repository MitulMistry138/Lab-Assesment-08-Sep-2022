/*program :- Write a java program to calculate simple interest(SI =PxRxt).  ( P and  R  are input from user)
@author:- Mitul Mistry
@date - 08-Sep-2022 (Lab assesment) 
*/
import static java.lang.System.*;   // importing java .lan package 
class   SimpleInterest // declaring class name as SimpleInterest

{

public static void main(String ...args)  // command line arguement
{
	int principle_p = Integer.parseInt(args[0]);  // taking first input from user
	
	double rate_r = Double.parseDouble(args[1]);	// takng the second input from user
 
     float t = 5.6f;
	
	double simple_interest = (double)((principle_p*rate_r*t)/100);       //  typecasting to double  
	
	out.println("The Value  is :- " +simple_interest);  // print simpleInterest  
	 
	} // end of method
	
	
}// end of class
