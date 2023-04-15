#include <stdio.h>
#include <math.h>

float f(float x, float y) {
  float m;
  m=(x-y)/(x+y);
  return m;
}

int main() {
  float x0, y0, m1, m2, m3, m4, m, y=y0, x=x0, h, xn;
  printf("Enter x0, y0, xn, h");
  scanf("%f%f%f%f", &x0, &y0, &xn, &h);
  printf("\n\nx\t\ty\n");
  while (x<xn) {
    m1=f(x0,y0);
    m2=f((x0+h/2.0), (y0+m1*h/2.0));
    m3=f((x0+h/2.0), (y0+m2*h/2.0));
    m4=f((x0+h/2.0), (y0+m3*h/2.0));
    m=((m1+m2*2+m3*3+m4)/6);
    y+=m*h;
    x+=h;
    printf("%f\t%f\n", x, y);
  }
}
