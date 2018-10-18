public class RStraightLib
{
    public static String dateStr(String str)
    {
        /**
         * grabs month, day, and year from each given date string
         * @return day, month, then year, each with a "-" in between to re-format
         * @param str the original date string.
         */
        String month = str.substring(0,2);
        String day = str.substring(3,5);
        String year= str.substring(6,10);
        String s = day + "-" + month + "-" + year;
        return s;
    }

    public static String cutOut(String mainStr, String subStr)
    {
        /**
         * takes smaller string within main string out of string, if smaller string is in main string
         * @param mainStr the original, main string
         * @param subStr the smaller string that may exist within the main string
         */
        if (mainStr.indexOf(subStr) != -1)
        {
            /**
             * if String subStr exists within String mainStr, the following code proceeds,
             * str1 is the substring of mainStr from the first letter of mainStr to one before the first letter of subStr
             * str2 is the substring of mainStr from the letter after the last letter of subStr to the last letter of mainStr
             * @return the string that puts str1 and str2 together (mainStr without subStr)
             */
            int x = mainStr.indexOf(subStr);
            String str1 = mainStr.substring(0, x);
            String str2 = mainStr.substring(x+subStr.length());
            String str3 = str1 + str2;
            return str3;
        }
        else
        /**
         * if subStr does NOT exist in mainStr, the following code proceeds,
         * @return the original value of mainStr
         */
        {
            return mainStr;
        }
    }


    public static boolean isFibonacci(int x)
    {
        /**
         * integers a, b, and c are set as the first 3 values of the Fibonacci sequence
         * @param x is any given number
         */
        int a=1;
        int b=1;
        int c=2;


        while(a<=x & b<=x & c<=x)
        {

            /**
             * the following code repeats until a, b, or c is greater than x
             * integer a changes to itself plus b; b changes to itself plus c, and c changes to itself plus a
             */

            a=a+b;
            b=b+c;
            c=b+a;
            if(x==a || x==b || x==c)
            {
                /**
                 * if x is equal to a, b, OR c, the number is deemed part of the Fibonacci sequence
                 * @return value is set to true, as x is, indeed Fibonacci
                 */
                return true;
            }
        }
        /**
         * if x is not equal to a, b, or c, at any point, the following executes
         * @return value is false, because x is NOT Fibonacci
         */
        return false;
    }


    public static void multiplicationTable(int b,int r)
    {
        /**
         * String str1 is set to equal a blank string
         * integer a is set to zero
         * @param b is the base value
         * @param r is the range value
         */
        String str1= "";
        int a= 0;
        for(int n = 0; n <= r; n++)
        {
            /**
             * integer n starts at zero, and increases by 1, then the following code loops until n is equal to the range value
             * integer a is set to the base value times n
             * str1 is set to itself, plus a space, plus previously defined integer, a
             * when n=r, the system prints str1, which is at that point a multiplication table, printing r consecutive multiples of b
             */
            a = b*n;
            str1 = str1+ " " +a;
            System.out.println(str1);
        }
    }


    public static void fooBarBaz(int num1)
    {
        /**
         * @param num1 is a given integer
         */
        for(int x=1;x <= num1;x++)
        {
            /**
             * with integer x starting at 1, increasing by 1 every loop, the following code loops until x=num1
             * system prints something for every value of x, until x=num1
             */
            if(x%3 != 0 && x%5 != 0)
            {
                /**
                 * if the remainder of x/3 is NOT zero, AND the remainder of x/5 is NOT zero, the following code executes
                 * System prints int x
                 */
                System.out.println(x);
            }
            if ((x%3 == 0) && (x%5 == 0))
            {
                /**
                 * if the remainder of x/3 IS zero, AND the remainder of x/5 IS zero, the following code executes
                 * System prints "baz"
                 */
                System.out.println("baz");
            }
            if((x%3 == 0) && (x%5 !=0))
            {
                /**
                 * if the remainder of x/3 IS zero, AND the remainder of x/5 is NOT zero, the following code executes
                 * System prints "foo"
                 */
                System.out.println("foo");
            }
            if((x%5 == 0) && (x%3 != 0))
            {
                /**
                 * if the remainder of x/5 IS zero, AND the remainder of x/3 is NOT zero, the following code executes
                 * System prints "bar"
                 */
                System.out.println("bar");
            }
        }
    }
}