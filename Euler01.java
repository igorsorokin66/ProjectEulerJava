/**
 * Purpose:
 * @Author: Igor Sorokin
 * @E-Mail: sorokin_igor@yahoo.com
 * @Version: 0.01
 */
import java.util.HashSet;

public class Euler01
{
    public static void main(String[] args)
    {
        //HashSet set1 = new HashSet();

        int sumOfMultiples = 0;

        for (int i = 1; i <= 333; i++)//333 multiples
        {
            sumOfMultiples += (3*i);
        }

        System.out.println(sumOfMultiples);

        for (int i = 1; i <= 199; i++)//199 multiples
        {
            if (((5*i)%3) == 0){}
            else {sumOfMultiples += (5*i);}
        }

        System.out.println(sumOfMultiples);
         
    }
}
