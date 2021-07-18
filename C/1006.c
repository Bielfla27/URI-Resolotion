#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{ float A, B, C;
  float MEDIA ;

  scanf("%f" , &A);
  scanf("%f" , &B);
  scanf("%f" , &C);

  A = A*2 ;
  B = B*3 ;
  C = C*5 ;

  A= A/10;
  B= B/10;
  C= C/10;
  MEDIA = A+B+C;

  printf("MEDIA = %.1f\n" , MEDIA);

}
