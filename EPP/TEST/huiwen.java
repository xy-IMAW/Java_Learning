import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner key= new Scanner(System.in);
        StringBuilder str=key.next();
        

    }
    public static boolean isHuiwen(StringBuilder str) {
        if(str!=""){
        str2=str.reverse();

        if(str.equals(str2))
            return true;
        else 
            return false;
        }
        else
            return false;
       
    }
    public static int strMaker(StringBuilder str) {
        if(str.length()>=1){
        
        for(int i=0;i<str.length();i++){
            if(isHuiwen(str)){
                return 1+strMaker(str.delete(i, i));}
            else 
                return 0;
        }
            
       
        }
        else
        return 0;
    
        
    }

    
}