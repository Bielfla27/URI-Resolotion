#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{ float A, B;
  float MEDIA ;

  scanf("%f" , &A);
  scanf("%f" , &B);

  A = A*3.5 ;
  B = B*7.5 ;

  A= A/11;
  B= B/11;
  MEDIA = A+B;

  printf("MEDIA = %.5f\n" , MEDIA);

}
