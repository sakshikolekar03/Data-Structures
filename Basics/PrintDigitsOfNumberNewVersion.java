import java.util.*;
    
    public class PrintDigitsOfNumberNewVersion{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n= scn.nextInt();
      
      int pow = 1;
      int temp = n;
      while(temp>= 10){
          temp = temp/10;
          pow  = pow*10;
      }
      while(pow>0){
          int firstval = n/pow;
          System.out.println(firstval);
          n = n%pow;
          pow = pow/10;
          
      }
      
     }
    }