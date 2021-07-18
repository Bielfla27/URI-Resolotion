#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{ float A, B, C, D;
  float DIF ;

  scanf("%f" , &A);
  scanf("%f" , &B);
  scanf("%f" , &C);
  scanf("%f" , &D);


  A = A * B ;
  C = C * D ;

  DIF = A - C ;

  printf("DIFERENCA = %.0f\n" , DIF);

}

