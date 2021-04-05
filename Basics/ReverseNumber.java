/*1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
*/
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