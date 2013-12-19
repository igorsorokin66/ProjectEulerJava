/**
 * Purpose:
 * @Author: Igor Sorokin
 * @E-Mail: sorokin_igor@yahoo.com
 * @Version: 0.01
 */
public class Euler17
{
    public static void main(String[] args)
    {
        String grandTotal = "";

        for (int i = 1; i <= 1000; i++)
        {
        String subTotal = "";
        char first = '0';
        char tenth = '0';
        char hundredth = '0';
        char thousandth = '0';
        
        if (i <= 9)
        {first = Integer.toString(i).charAt(0);}
        if (i <= 99 && i >= 10)
        {tenth = Integer.toString(i).charAt(0);
         first = Integer.toString(i).charAt(1);}
        if (i <= 999 && i >= 100)
        {hundredth = Integer.toString(i).charAt(0);
         tenth = Integer.toString(i).charAt(1);
         first = Integer.toString(i).charAt(2);}
        if (i <= 9999 && i >= 1000)
        {thousandth = Integer.toString(i).charAt(0);
         hundredth = Integer.toString(i).charAt(1);
         tenth = Integer.toString(i).charAt(2);
         first = Integer.toString(i).charAt(3);}
        
        switch (thousandth)
        {
            case '0': {break;}
            case '1': {subTotal += ("onethousand"); break;}
            case '2': {subTotal += ("twothousand"); break;}
            case '3': {subTotal += ("threethousand"); break;}
            case '4': {subTotal += ("fourthousand"); break;}
            case '5': {subTotal += ("fivethousand"); break;}
            case '6': {subTotal += ("sixthousand"); break;}
            case '7': {subTotal += ("seventhousand"); break;}
            case '8': {subTotal += ("eightthousand"); break;}
            case '9': {subTotal += ("ninethousand"); break;}
        }
        
        switch (hundredth)
        {
            case '0': {break;}
            case '1': {subTotal += ("onehundred");break;}
            case '2': {subTotal += ("twohundred");break;}
            case '3': {subTotal += ("threehundred");break;}
            case '4': {subTotal += ("fourhundred");break;}
            case '5': {subTotal += ("fivehundred");break;}
            case '6': {subTotal += ("sixhundred");break;}
            case '7': {subTotal += ("sevenhundred");break;}
            case '8': {subTotal += ("eighthundred");break;}
            case '9': {subTotal += ("ninehundred");break;}
        }
        
        switch (tenth)
        {
            case '0': {break;}
            case '1': 
            {
                switch (first)
                {
                    case '0': {subTotal += ("ten");break;}
                    case '1': {subTotal += ("eleven");break;}
                    case '2': {subTotal += ("twelve");break;}
                    case '3': {subTotal += ("thirteen");break;}
                    case '4': {subTotal += ("fourteen");break;}
                    case '5': {subTotal += ("fifteen");break;}
                    case '6': {subTotal += ("sixteen");break;}
                    case '7': {subTotal += ("seventeen");break;}
                    case '8': {subTotal += ("eighteen");break;}
                    case '9': {subTotal += ("nineteen");break;}
                }
                first = '0';
                break;
            }
            case '2': {subTotal += ("twenty");break;}
            case '3': {subTotal += ("thirty");break;}
            case '4': {subTotal += ("forty");break;}
            case '5': {subTotal += ("fifty");break;}
            case '6': {subTotal += ("sixty");break;}
            case '7': {subTotal += ("seventy");break;}
            case '8': {subTotal += ("eighty");break;}
            case '9': {subTotal += ("ninety");break;}
        }

        switch (first)
        {
            case '0': {break;}
            case '1': {subTotal += ("one");break;}
            case '2': {subTotal += ("two");break;}
            case '3': {subTotal += ("three");break;}
            case '4': {subTotal += ("four");break;}
            case '5': {subTotal += ("five");break;}
            case '6': {subTotal += ("six");break;}
            case '7': {subTotal += ("seven");break;}
            case '8': {subTotal += ("eight");break;}
            case '9': {subTotal += ("nine");break;}
        }
        grandTotal += (subTotal);
        }
        System.out.println(grandTotal.length() + (99 * 9 * 3));
        //System.out.println(grandTotal);
        //+ 98 and in each hundred and 9 hundreds and 3 characters
    }
}
