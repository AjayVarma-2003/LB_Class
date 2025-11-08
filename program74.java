// Checked exception.
import java.io.*;

class program74
{
    public static void main(String A[])
    {
        int iNo = 0, iCnt = 0;

        BufferedReader bObj = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number : ");
        iNo = Integer.parseInt(bObj.readLine());

        for(iCnt = 1; iCnt <= (iNo / 2); iCnt++)
        {
            if((iNo % iCnt) == 0)
            {
                System.out.println(iCnt);
            }
        }
    }
}