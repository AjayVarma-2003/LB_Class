// OOP design

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int iNo)
    {
        this.iSize = iNo;
        this.Arr = new int[iNo];
    }
}

class program103
{
    public static void main(String A[])
    {
        ArrayX aObj1 = new ArrayX(5);
        ArrayX aObj2 = new ArrayX(7);
        ArrayX aObj3 = new ArrayX(3);
    }
}