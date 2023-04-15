/*PROGRAM TO IMPLEMENT THE SIMPSON'S 1/3rd RULE*/
#include<stdio.h>
#include<math.h>

float F(float x) {
	return(1/(1+x*x));
}

int main() {
	int count, no_div;
	float lower, upper, x0, h, sum, result;
	float F(float x);
	printf("\nSIMPSON's 1/3rd RULE\n====================\n\nEnter the lower and upper limits: ");
	scanf("%f %f", &lower, &upper);
	printf("\nEnter the number of divisions (EVEN number): ");
	scanf("%d", &no_div);
	if(no_div%2!=0) {
		printf("\nNumber of divisions selected is not even, program terminated.\n");
		return 0;
	}
	h=(upper-lower)/no_div;
	sum=F(lower)+F(upper);
	x0=lower;
	for(count=1; count<no_div; count++) {
		x0+=h;
		if(count%2!=0) sum=sum+4*F(x0);
		else sum=sum+2*F(x0);
	}
	result=sum*(h/3);
	printf("\nReqd. integration from %.2f to %.2f when h=%.2f is I=%.3f\n\n", lower, upper, h, result);
	return 0;
}
