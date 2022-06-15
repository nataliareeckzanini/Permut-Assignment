// Student: Natalia Reeck Zanini

public class Main
{
    //Permut Function:
    public static double permut(double n,double r)
    {
        //If "n" is lower than "r" it will return "-1".
        if(n < r)
        {
            return -1;
        }
        
        //If "n" is equal to "1" than return "n" which is "1".
        if(n==1.0)
        {
            //Returning "n" which in this case is "1"
            return n;
        }
        else if(n == (r+1))
        {
            //Here if "n" equals to "r+1" it will call permut(n-1,n-2) 
        	//preventing the divison by "0" happening.
            return n*permut(n-1,n-2);
        }
        else
        {
            //Calling permut(n-1,r)
            return n/(n-r)*permut(n-1,r);
        }
    }
    
    //Test Cases (Required by assignment and extras)
        public static void main(String[] args) {
            	System.out.print("Test Case P(5,1): ");
                System.out.println((int)permut(5,1));
                System.out.println();
                
                System.out.print("Test Case P(55,5): ");
                System.out.println((int)permut(55,5));
                System.out.println();
                
                System.out.print("Test Case P(52,5): ");
                System.out.println((int)permut(52,5));
                System.out.println();
                
                System.out.print("Test Case P(7,4): ");
                System.out.println((int)permut(7,4));
                System.out.println();
        }
}