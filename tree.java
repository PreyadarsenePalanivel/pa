#include <stdio.h>

int main(void) {
int n,i,j=0,a[100],a1[100];
scanf("%d",&n);
for(i=0;i<n;i++)
	scanf("%d",&a[i]);
for(i=0;i<n;i++)
{
	int c=0;
	while(a[i])
	{
		int rem=a[i]%2;
		a[i]=a[i]/2;
		c++;
    }
    a1[j++]=c;
}
for(i=0;i<n;i++)
{
	for(j=0;j<n;j++)
	{
		if(a1[i]>a1[j])
		{
			int t=a1[i];
			a1[i]=a1[j];
			a1[j]=t;
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}
		else if(a1[i]==a1[j])
		{
			if(a[i]>a[j])
		{
			int t=a1[i];
			a1[i]=a1[j];
			a1[j]=t;
			t=a[i];
			a[i]=a[j];
			a[j]=t;
		}	
		}
	}
}
for(i=0;i<n;i++)
printf("%d ",a[i]);
return 0;
}