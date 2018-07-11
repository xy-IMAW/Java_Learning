import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);
     
      String string = key.nextLine();
      int x = key.nextInt();
      String[] str = string.split("\\s+");
      int[] num = new int[str.length];
      for(int i=0;i<str.length;i++){
         num[i] =Integer.parseInt(str[i]);
      }

      //¶þ·Ö²éÕÒ
      System.out.print(biSearch(num, x));

       }
       public static int biSearch(int []array,int a){
        int lo=0;
        int hi=array.length-1;
        int mid;
           int t = (lo+hi)/2;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(array[mid]==a){
                return mid;
            }else if(array[mid]<a){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
         for(int i=0;i<array.length;i++){
			if(array[i]>a)
				return i;
		}
		return array.length;
    }
 

}