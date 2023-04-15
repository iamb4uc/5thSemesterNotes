/*PROGRAM TO IMPLEMENT THE RUNGE-KUTTA METHOD*/
#include<stdio.h>
#include<math.h>

float F(float x, float y) {
	return(x+y*y);
}

int main() {
	int step, n;
	float x0, y0, k1, k2, k3, k4, h, X, Y, dely;
	float F(float, float);
	printf("\nRUNGE-KUTTA METHOD\n==================\n\nEnter the initial values of x and y: ");
	scanf("%f %f", &x0, &y0);
	printf("\nEnter the step-size: ");
	scanf("%f", &h);
	printf("\nEnter the value of X at which Y is to be calculated: ");
	scanf("%f", &X);
	n=X/h;
	printf("\nSTEP\tX\tY\n---------------------------");
	for(step=1; step<=n; step++) {
		k1=h*F(x0, y0);
		k2=h*F((x0+h/2), (y0+k1/2));
		k3=h*F((x0+h/2), (y0+k2/2));
		k4=h*F((x0+h), (y0+k3));
		dely=(k1+2*k2+2*k3+k4)/6;
		Y=y0+dely;
		x0+=h;
		printf("\n%2d\t%.2f\t%.5f", step, x0, Y);
		y0=Y;
	}
	printf("\n\nThe reqd. result is %.5f\n\n", Y);
	return 0;
}

