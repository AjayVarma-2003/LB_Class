
import java.util.*;

// OOP design

class ArrayX
{
    public int Arr[];
    public int iSize;

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
}

class program104
{
    public static void main(String A[])
    {
        ArrayX aObj1 = new ArrayX(5);
        ArrayX aObj2 = new ArrayX(7);
    }
}