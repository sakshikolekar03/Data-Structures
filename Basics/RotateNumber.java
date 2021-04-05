import java.util.*;

public class RotateNumber {

    public static void main(String[] args) {
        // write your code here  
        Scanner sc= new Scanner(System.in);
        
        int n=sc.nextInt();
        int k=sc.nextInt();
        
        int fno=0,sno=0, pow=0,tmp=n,cnt=0;
        // length of number
         while(tmp>0)
         {
             cnt++;
             tmp/=10;
         }
         
         k=k%cnt;// k in range / balance k
           
        if(k<0)//handle neg and pos 
        k=k+cnt;// neg -2 reverese means +3 pos rev
         
 
            pow=(int)Math.pow(10,k);
            fno=n/pow; //div
            sno=n%pow; //rem
            pow= (int)Math.pow(10,cnt-k);
            sno=sno*pow+fno;
            System.out.print(sno);

    }
}