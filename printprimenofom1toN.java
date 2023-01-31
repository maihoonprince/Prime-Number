import java.util.*;

public class printprimenofom1toN 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for(num=2;num<=n; num++)
        {
            int count = 0;
            for(int div=1; div <= num; div++)
            {
                if(num % div==0)
                {
                    count++;
                }
            }
            if(count == 2)
            {
                System.out.println(num);
            }
        }
    }
    
}
