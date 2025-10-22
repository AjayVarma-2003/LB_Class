# include <stdio.h>

int SumDigits(int iNo)
{
    int iDigit = 0, iSum = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10;
        iSum = iSum + iDigit;
    }

    return iSum;
}

int main()
{
    int iValue = 0, iRet = 0;;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iRet = SumDigits(iValue);
    printf("Addition of digits in the number is : %d \n", iRet);
    
    return 0;
}