#include<stdio.h>
#include<conio.h>
void main()
{
int a,b,n;
clrscr();
scanf("%d",&n);
if(n<3)
{
printf("%d",n);
}
if(n<5&&n>=3)
{
a=n%3+n/3;
printf("%d",a);
}
if(n>=5)
{
b=n%5+n/5;
printf("%d",b);
}
getch();
}