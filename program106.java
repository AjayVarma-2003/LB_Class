
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
}

class program106
{
    public static void main(String A[])
    {
        ArrayX aObj1 = new ArrayX(5);
        System.out.println(aObj1.iSize);        // Error

        // Bad code (need of access specifier)
        aObj1.iSize = 11;                       // Error
        aObj.Arr = null;                        // Error

        ArrayX aObj2 = new ArrayX(7);
        System.out.println(aObj2.iSize);        // Error
    }
}