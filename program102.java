import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;

        System.out.println("\nElements of array are : ");

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.print(Brr[iCnt] + "\t");
        }
    }

    public int CountEven(int Brr[])
    {
        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            if(Brr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }

    public int Summation(int Brr[])
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            iSum = iSum + Brr[iCnt];
        }

        return iSum;
    }
}

class program102
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iSize = 0, iCnt = 0, iRet = 0;

        System.out.println("Enter the size of array : ");
        iSize = sObj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sObj.nextInt();
        }

        ArrayX aObj = new ArrayX();
        aObj.Display(Arr);
        System.out.println();

        iRet = aObj.Summation(Arr);
        System.out.println("\nAddition of elements of array is : " + iRet);

        // Important lines
        aObj = null;
        Arr = null;
        sObj = null;

        System.gc();
    }
}