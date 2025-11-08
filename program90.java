
import java.util.Scanner;

class Digit
{
    public void DisplayDigit(int iNo)
    {
        int iDigit = 0;

        if(iNo < 0)
        {
            iNo = -iNo;
        }

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            System.out.println(iDigit);

            iNo = iNo / 10;
        }
    }
}

class program90
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sObj.nextInt();

        Digit dObj = new Digit();
        
        dObj.DisplayDigit(iValue);

        sObj = null;
        dObj = null;

        System.gc();
    }
}