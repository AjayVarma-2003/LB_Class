
import java.util.Scanner;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0, iSum = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            iSum = iSum + iDigit;

            iNo = iNo / 10;
        }

        return iSum;
    }
}

class program91
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sObj.nextInt();

        Digit dObj = new Digit();
        
        iRet = dObj.SumDigits(iValue);
        System.out.println("Addition of digits is : " + iRet);

        sObj = null;
        dObj = null;

        System.gc();
    }
}