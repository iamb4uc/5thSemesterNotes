/*PROGRAM TO IMPLEMENT THE BISECTION METHOD*/
#include<stdio.h>
#include<math.h>
#define EPS 0.000001

float F(float x) {
	return((x*x*x)-4*x-9);
}

int main() {
	float init1, init2, x0, X;
	float F(float);
	printf("\nBISECTION METHOD\n================\n\nEnter the initial values for calculation: ");
	scanf("%f %f", &init1, &init2);
	if(F(init1)*F(init2)>0) {
		printf("\nThere is no root between %.2f and %.2f\n\n", init1, init2);
		return 0;
	}
	while(1) {
		x0=(init1+init2)/2;
		if(F(init1)*F(x0)<0) {
			init2=x0;
			X=(init1+init2)/2;
			if(fabs(X-init1) < EPS) break;
			else continue;
		} else {
			init1=x0;
			X=(init1+init2)/2;
			if(fabs(X-init2) < EPS) break;
			else continue;
		}
	}
	printf("\nThe required root is %.5f\n\n", X);
	return 0;
}

