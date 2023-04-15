/*PROGRAM TO IMPLEMENT THE TRAPEZOIDAL RULE*/
#include<stdio.h>
#include<math.h>

float F(float x) {
	return(1/(1+x*x));
}

int main() {
	int count, no_div;
	float lower, upper, x0, h, sum, result;
	float F(float x);
	printf("\nTRAPEZOIDAL RULE\n================\n\nEnter the lower and upper limits: ");
	scanf("%f %f", &lower, &upper);
	printf("\nEnter the segment width: ");
	scanf("%f", &h);
	no_div=(upper-lower)/h;
	sum=(F(lower)+F(upper))/2;
	x0=lower;
	for(count=1; count<no_div; count++) {
		x0+=h;
		sum=sum+F(x0);
	}
	result=sum*h;
	printf("\nRequired integration from %.2f to %.2f when h=%.2f is I=%.3f\n\n", lower, upper, h, result);
	return 0;
}
