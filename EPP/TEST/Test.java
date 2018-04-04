 import java.util.*;
 class Test{
      public static void main(String agr[]){
			System.out.println(countWays(6));
	     }
 
    public static int countWays(int n) {
        // write code here
		int r;
        if(n==1)
            return 1;
        else if((n-1)%2==0){
			 return (int)(1+Math.pow(2,n-3));
			
            
		}
        else
		 return (int)Math.pow(2,(n-1)/2);
          
    }
}