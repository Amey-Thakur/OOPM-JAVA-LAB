public class labelled_continue {

   public static void main(String args[]) {
     
        a:for(int j=0;j<10;j++)
	{

        System.out.println("Outer Loop----"+j);
        
	for(int i=0;i<10;i++)
	{
        
        if(j==5)
         {
            continue a;
         }
        System.out.println("Inner Loop"+i);
        
        	
        }
	}
      }
   }

