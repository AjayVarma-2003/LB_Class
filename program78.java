
import java.util.*;

class Number
{
    public void DisplayFactors(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}   // End of Number class.

class program78
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sObj.nextInt();
        
        Number nObj = new Number();
        nObj.DisplayFactors(iValue);

        // Important below 3 lines
        sObj = null;
        nObj = null;

        System.gc();
    }
}