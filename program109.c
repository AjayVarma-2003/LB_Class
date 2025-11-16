# include <stdio.h>

int main()
{
    int Arr[] = {10, 20, 30, 40};

    printf("%lu \n", Arr);
    printf("%lu \n", &Arr);
    printf("%d \n", &(Arr[0]));
    printf("%d \n", sizeof(Arr));

    return 0;
}