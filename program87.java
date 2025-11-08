
import java.util.Scanner;

class Number
{
    public int CalculateFactorial(int iNo)
    {
        int iCnt = 0, iFact = 1;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }
}

class program87
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sObj.nextInt();

        Number nObj = new Number();
        
        iRet = nObj.CalculateFactorial(iValue);
        System.out.println("Factorial of number is : " + iRet);

        sObj = null;
        nObj = null;

        System.gc();
    }
}