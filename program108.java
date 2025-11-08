
import java.util.*;

// OOP design

class ArrayX
{
    private int Arr[];
    private int iSize;

    public ArrayX(int iNo)
    {
        System.out.println("Inside constructor ...");
        this.iSize = iNo;
        this.Arr = new int[iNo];
    }

    public void Accept()
    {
        int iCnt = 0;
        Scanner sObj = new Scanner(System.in);

        System.out.println("Enter the elements of array : ");
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sObj.nextInt();
        }
    }

    public void Display()
    {
        int iCnt = 0;

        System.out.println("Elements of array are : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }     
    }

    public float AvgOfElements()
    {
        int iCnt = 0, iSum = 0;
        float Avg = 0.0f;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        Avg = (float)iSum / (float)iSize;

        return Avg;
    }
}   // End of ArrayX class.

class program108
{
    public static void main(String A[])
    {
        float fRet = 0.0f;
        ArrayX aObj1 = new ArrayX(5);

        aObj1.Accept();
        aObj1.Display();
        
        fRet = aObj1.AvgOfElements();
        System.out.println("Average of the elements of the array is : " + fRet);
    }
}