/*PROGRAM TO IMPLEMENT LINEAR REGRESSION*/
#include<stdio.h>
#include<math.h>

int main() {
	int i, no_data;
	float x[10], y[10], a, b, sumx=0.0, sumy=0.0, sumxx=0.0, sumxy=0.0;
	printf("\nLINEAR REGRESSION\n=================\nFitting a line of the form: f(x) = a + bx\n");
	printf("\nEnter no. of data points: ");
	scanf("%d", &no_data);
		printf("\nEnter independent variables x:\n");
	for(i=0; i<no_data; i++) scanf("%f", &x[i]);
	printf("\nEnter dependent variables y=f(x):\n");
	for(i=0; i<no_data; i++) scanf("%f", &y[i]);
	for(i=0; i<no_data; i++) {
		sumx=sumx+x[i];
		sumy=sumy+y[i];
		sumxx=sumxx+(x[i]*x[i]);
		sumxy=sumxy+(x[i]*y[i]);
	}
	b=(no_data*sumxy - sumx*sumy)/(no_data*sumxx - sumx*sumx);
	a=sumy/no_data - b*(sumx/no_data);
	printf("\nThe required regression line is:\n\tf(x)=%.2f+%.2fx\n\n", a, b);
	return 0;
}
