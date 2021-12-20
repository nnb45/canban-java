#include <stdio.h>
void main()
{
    float a,b,x;
    printf("nhap gia tri a va b cho phuong trinh co dang ax + b: ");
    scanf("%f %f",&a,&b);
    if (a == 0)
    {
        
        if (b==0)
        {
            printf("phuong trinh co vo so nghiem");
        }
        if (b!=0)
        {
            printf("phuong trinh vo so nghiem");
        }
   
    }
    else 
    {
        x=a/b;
        printf("nghiem cua phuong trinh la x = %.2f",x);
    }
    return(0);
}