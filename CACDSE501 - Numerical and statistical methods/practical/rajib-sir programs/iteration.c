/*PROGRAM TO IMPLEMENT ITERATION METHOD*/
#include<stdio.h>
#include<math.h>
#define EPS 0.00001

float F(float x) {
	return((x*x*x)+(x*x)-1);
}

float G(float x) {
	return(1/sqrt(x+1));
}

int main() {
	int count, MAXIT;
	float init1, init2, x, x0;
	float F(float), G(float);
	printf("\nITERATION METHOD\n================\n");
	printf("\nEnter the starting values: ");
	scanf("%f %f", &init1, &init2);
	printf("\nEnter maximum no. of iterations allowed: ");
	scanf("%d", &MAXIT);
	if(F(init1)*F(init2)>0) {
		printf("\nThere is no root between %.2f and %.2f.\n\n", init1, init2);
		return 0;
	}
	x0=(init1+init2)/2;
	for(count=0; count<MAXIT; count++) {
		x=G(x0);
		if(fabs(x-x0) < EPS) break;
		else x0=x;
	}
	if(count==MAXIT) {
		printf("\nProcess does not converge in %d iterations.\n\n", MAXIT);
		return 0;
	}
	printf("\nRequired root is %.5f\n\n", x);
	return 0;
}
