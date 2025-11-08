
import java.util.*;

class Number
{
    public boolean ChkPerfect(int iNo)
    {
        int iCnt = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
                if(iSum > iNo)
                {
                    break;
                }
            }
        }

        return (iSum == iNo);
    }
}   // End of Number class.

class program83
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sObj.nextInt();
        
        Number nObj = new Number();

        bRet = nObj.ChkPerfect(iValue);

        if(bRet == true)
        {
            System.out.println(iValue + " is perfect number.");
        }
        else
        {
            System.out.println(iValue + " is not perfect number.");
        }

        // Important below 3 lines
        sObj = null;
        nObj = null;

        System.gc();
    }
}