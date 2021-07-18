#include<stdio.h>
int main(){
    int num,horas;
   double valorh, sal;
   scanf("%d", &num);
   scanf("%d", &horas);
   scanf("%lf",&valorh);
   printf("NUMBER = %d\n", num);
   sal=valorh*(float)horas;
   printf("SALARY = U$ %.2lf\n", sal);
}
