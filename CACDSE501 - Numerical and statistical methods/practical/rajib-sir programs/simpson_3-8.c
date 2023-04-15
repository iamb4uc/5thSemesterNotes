/*PROGRAM TO IMPLEMENT THE SIMPSON'S 3/8th RULE*/
#include<stdio.h>
#include<math.h>

float F(float x) {
	return(1/(1+x*x));
}

int main() {
	int count, no_div;
	float lower, upper, x0, h, sum, result;
	float F(float x);
	printf("\nSIMPSON's 3/8th RULE\n====================\n\nEnter the lower and upper limits: ");
	scanf("%f %f", &lower, &upper);
	printf("\nEnter the number of divisions (multiple of 3): ");
	scanf("%d", &no_div);
	if(no_div%3!=0) {
		printf("\nNumber of divisions selected is not a multiple of 3, program terminated.\n");
		return 0;
	}
	h=(upper-lower)/no_div;
	sum=F(lower)+F(upper);
	x0=lower;
	for(count=1; count<no_div; count++) {
		x0+=h;
		if(count%3!=0) sum=sum+3*F(x0);
		else sum=sum+2*F(x0);
	}
	result=sum*3*(h/8);
	printf("\nReqd. integration from %.2f to %.2f when h=%.2f is I=%.3f\n\n", lower, upper, h, result);
	return 0;
}
