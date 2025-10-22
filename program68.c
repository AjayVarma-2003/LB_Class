# include <stdio.h>

int CountDigits(int iNo)
{
    int iDigit = 0, iCout = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        iNo = iNo / 10;
        iCout++;
    }

    return iCout;
}

int main()
{
    int iValue = 0, iRet = 0;;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iRet = CountDigits(iValue);
    printf("Number of digits in the number are : %d \n", iRet);
    
    return 0;
}