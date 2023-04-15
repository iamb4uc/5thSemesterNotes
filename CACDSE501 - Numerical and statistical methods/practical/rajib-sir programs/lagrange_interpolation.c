/*PROGRAM TO IMPLEMENT LAGRANGE INTERPOLATION FORMULA*/
#include<stdio.h>
#include<math.h>

int main() {
	int no_data, i, j;
	float x[10], y[10], X, lf, sum;
	printf("\nLAGRANGE INTERPOLATION\n======================\n\nEnter number of data points: ");
	scanf("%d", &no_data);
	printf("\nEnter independent variables x:\n");
	for(i=0; i<no_data; i++) scanf("%f", &x[i]);
	printf("\nEnter dependent variables y=f(x):\n");
	for(i=0; i<no_data; i++) scanf("%f", &y[i]);
	printf("\nEnter the point at which interpolation is required: ");
	scanf("%f", &X);
	sum=0;
	for(i=0; i<no_data; i++)
	{
		lf=1.0;
		for(j=0; j<no_data; j++)
			if(i!=j)
				lf=lf*(X-x[j])/(x[i]-x[j]);
		sum=sum+y[i]*lf;
	}

	printf("\nRequired interpolated value is\n\tf(%.2f) = %.4f\n\n", X, sum);
	return 0;
}
