////////////////////////////////////////////////////////////////////////////
//
// Required Header files
//
////////////////////////////////////////////////////////////////////////////

# include<stdio.h>                                      // For input output
# include<stdbool.h>                                    // For bool data type

////////////////////////////////////////////////////////////////////////////
//
// Function Name :- CheckEvenOdd
// Description :-   It is used to check number is even or odd
// Input :-         Integer
// Output :-        Boolean
// Author :-        Ajay Yogesh Varma
// Date :-          10-10-2025
//
////////////////////////////////////////////////////////////////////////////

bool CheckEvenOdd(
                    int iNo                             // First input
                 )
{
    int iRem = 0;                                       // To store remainder of division

    iRem = iNo % 2;                                     // Buisness logic

    if(iRem == 0)                                       // Conditional checking
    { return true; }
    else
    { return false; }
}   // End of CheckEvenOdd

////////////////////////////////////////////////////////////////////////////
//
// Entry point function.
//
////////////////////////////////////////////////////////////////////////////

int main()
{
    int iValue = 0;                                     // To take input from user.
    bool bRet = false;                                  // To store return value of boolean function.

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    bRet = CheckEvenOdd(iValue);                        // Function call

    if(bRet == true)                                    // Conditional checking
    {   printf("%d is even number. \n", iValue);   }
    else
    {   printf("%d is odd number. \n", iValue);    }

    return 0;
}   // End of main