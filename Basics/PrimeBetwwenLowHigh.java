import java.util.*;

public class PrimeBetwwenLowHigh{
    public static void main(String[] args) {
        // write your code here
        Scanner sc=new Scanner(System.in);
        int low=sc.nextInt();
        int high=sc.nextInt();
        int i;
        for(int j=low;j<=high;j++)
        {
            for( i=2;i*i<=j;i++)
            {
                if(j%i==0)
                {
                    break;
                }
            }
            if(i*i>j)
            System.out.println(j);
        }
    }
}