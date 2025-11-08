import java.util.*;

class ArrayX
{
    public void Display(int Brr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class program99
{
    public static void main(String A[])
    {
        Scanner sObj = new Scanner(System.in);

        int iSize = 0, iValue = 0;

        System.out.println("Enter the size of array : ");
        iSize = sObj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the elements : ");

        Arr[0] = sObj.nextInt();
        Arr[1] = sObj.nextInt();
        Arr[2] = sObj.nextInt();
        Arr[3] = sObj.nextInt();
        Arr[4] = sObj.nextInt();

        ArrayX aObj = new ArrayX();
        aObj.Display(Arr);

        // Important lines
        aObj = null;
        Arr = null;
        sObj = null;

        System.gc();
    }
}