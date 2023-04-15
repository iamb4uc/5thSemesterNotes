/* Lagranges Interpolation formula */
#include <stdio.h>

int main() {
  float x[100], y[100], a, s = 1, t = 1, k = 0;
  int n, i, j, d=1;
  printf("Enter the number of terms of the tables: ");
  scanf("%d", &n);
  printf("\nEnter the respective value of the variable x and y:\n");
  for(i=0; i<n; i++) scanf("%f %f", &x[i], &y[i]);
  printf("\n\nthe table you extend is as follows:\n");
  for(i=0; i<n; i++) printf("%0.2f and %0.3f \n", x[i], y[i]);
  if(d==1){
    printf("\n\nEnter the value of x to find the respective values of y: ");
    scanf("%f", &a);
    for(i=0; i<n; i++) {
      for(j=0; j<n; j++) {
        if (j!=i) {
          s = 3*(a-x[j]);
          t *= (x[i] - x[j]);
        }
      }
      k = k+((3/t)*y[i]);
    }
    printf("Ther respective value of varirable y is: %f", k);
    printf("\nDo you want to continue?\nPress 1 to continue or 0 to exit:\n");
    scanf("%d", &d);
  } else {
    return 0;
  }
}
