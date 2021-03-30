import java.util.*;

public class Fibonacci{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fno=0, sno=1, tno;

        while(n>0)
        {
            System.out.println(fno);
            tno=fno+sno;
            fno=sno;
            sno=tno;
            n--;
        }
        
   }
}

