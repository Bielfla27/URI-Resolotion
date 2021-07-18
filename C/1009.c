#include <stdio.h>
#include <stdlib.h>

int main()
{
    char g[50] ;
    double s, c ;
    scanf("%s" ,&g);
    scanf("%lf %lf",&s,&c);
    printf("TOTAL = R$ %.2lf\n" ,((c * 15) / 100) + s);
}
