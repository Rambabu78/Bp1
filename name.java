package project2;
import java.util.*;

public class dtp {

	public static void main(String[] args) {
	





		        Scanner sc = new Scanner(System.in);
		        long t=sc.nextLong();

		        for(int i=0;i<t;i++)
		        {

		            try
		            {
		                 long x=sc.nextLong();
		                System.out.println(x+" can be fitted in:");
		                if(x>=-((int)Math.pow(2,7))&&x<=((int)Math.pow(2,7)-1))
		                   {
		                    System.out.println("* byte");
		                   }
		                if(x>=-((int)Math.pow(2,15))&&x<=((int)Math.pow(2,15)-1))
		                   {
		                    System.out.println("* short");
		                   }
		                if(x>=-((int)Math.pow(2,31))&&x<=((int)Math.pow(2,31)-1))
		                   {
		                    System.out.println("* int");
		                   }
		                if(x>=-((long)Math.pow(2,63))&&x<=((long)Math.pow(2,63))-1)
		                   {
		                    
		                    System.out.println("* long");
		                   }
		                
		                //Complete the code
		            }
		            catch(Exception e) 
		            {
		                System.out.println(sc.next()+" can't be fitted anywhere.");
		            }

		        }
		    }
		





	}


