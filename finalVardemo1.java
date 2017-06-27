package Session4Assignment3;
import java.util.*;
public class finalVardemo1 {


// program to show the demo of final variable 

		final int var1=10;
public void todemo()
   {
		try
	    {
	        var1=30;
	        
	        System.out.println("Value of final variable: " + var1);
	        
	        // trying to change the final variable.
	     
	    }
	    catch (Exception Ex)
	    {
	        System.out.println("Oops Exception Occured - " + Ex.toString());
	    }
	}
public void displaymsg()
		{
			System.out.println("Printing final variable " +  var1);
		}

	}


