/*PROGRAM TO IMPLEMENT THE EULER'S METHOD*/
#include<stdio.h>
#include<math.h>

float F(float x, float y) {
	return(x*(-y));
}

int main() {
	float x0, y0, h, X, Y;
	float F(float, float);
	printf("\nEULER's METHOD\n==============\n\nEnter the initial values for calculation: ");
	scanf("%f %f", &x0, &y0);
	printf("\nEnter the segment width: ");
	scanf("%f", &h);
	printf("\nEnter the value of X at which Y is to be calculated: ");
	scanf("%f", &X);
	while(x0<X) {
		Y=y0+h*F(x0, y0);
		y0=Y;
		x0+=h;
	}
	printf("\nThe reqd. result is %.4f\n\n", Y);
	return 0;
}

