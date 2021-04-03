import java.util.*;
  
  public class CountDigit{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner scn = new Scanner(System.in);
    long n = scn.nextLong();
    long n1=n;
    int count=0;
    while(n>0){
        n = n/10;
        count++;
    }
    System.out.println("The number "+n1+ " has total "+count+" digits.");
   }
  }