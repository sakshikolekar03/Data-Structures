import java.util.*;

public class PrintDigitsOfNumber {

    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        
        long c=0,rem=0, rn=0,rc=0;
        while(n>0)//reverese the num
        {
            rem=n%10;
            rn=rn*10+rem;
            n=n/10;
            c++;
        }
       while(rn>0)//print reverese number from end to start
        {
            rem=rn%10;
            System.out.println(rem);
            rn=rn/10;
            rc++;
        }
        c=c-rc; //check for remianing zeros if present
        while(c>0){
            System.out.println(0);
            c--;
        }
       
    }
}