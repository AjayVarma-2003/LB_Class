
import java.util.Scanner;

class Number
{
    public long CalculateFactorial(int iNo)
    {
        int iCnt = 0;
        long lFact = 1;             // Important

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            lFact = lFact * iCnt;
        }

        return lFact;
    }
}

class program88
{
    public static void main(String A[])
    {
        int iValue = 0;
        long lRet = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sObj.nextInt();

        Number nObj = new Number();
        
        lRet = nObj.CalculateFactorial(iValue);
        System.out.println("Factorial of number is : " + lRet);

        sObj = null;
        nObj = null;

        System.gc();
    }
}