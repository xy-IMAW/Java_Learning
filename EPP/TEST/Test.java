 import java.util.*;
public class Test{
      public static void main(String agr[]){
      Scanner key = new Scanner(System.in);
     
      String string = key.nextLine();
      int x = key.nextInt();
      String[] str = string.split("\\s+");
      int[] num = new int[str.length];
      for(int i=0;i<str.length;i++){
        num[i] =Integer.parseInt(str[i]) ;
      }

      //二分查找
      System.out.print(biSearch(num, x));

       }
       public static int biSearch(int []array,int a){
        int lo=0;
        int hi=array.length-1;
        int mid;
        while(lo<=hi){
            mid=(lo+hi)/2;
            if(array[mid]==a){
                return mid+1;
            }else if(array[mid]<a){
                lo=mid+1;
            }else{
                hi=mid-1;
            }
        }
        if(lo==array.length-1){
          return array.length;

        }
        else
        return hi;
    }
 

}