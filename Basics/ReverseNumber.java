import java.util.*;
   
   public class ReverseNumber{
   
   public static void main(String[] args) {
     // write your code here
     Scanner scn=new Scanner(System.in);
     int n=scn.nextInt();
     int rem=0;
     while(n>0){
         rem = n%10;
         System.out.print(rem);
         n = n/10;
     }
    }
   }