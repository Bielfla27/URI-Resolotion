#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a, b, x, y;
    float c, d;
    scanf("%d %d %f",&a,&b, &c);
    scanf("%d %d %f",&x,&y, &d);
    c = c * b;
    d = d * y;
    c += d;
    printf("VALOR A PAGAR: R$ %.2f\n" ,c );
    return 0;
}

