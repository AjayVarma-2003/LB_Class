
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

        // Reverse loop
        for(iCnt = (iNo / 2); (iCnt >= 1) && (iSum < iNo); iCnt--)
        {
            if((iNo % iCnt) == 0)
            {
                iSum = iSum + iCnt;
            }
        }

        return (iSum == iNo);
    }
}   // End of Number class.

class program85
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