
import java.util.*;

class program73
{
    public static void main(String A[])
    {
        int iNo = 0, iCnt = 0;

        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sObj.nextInt();

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}