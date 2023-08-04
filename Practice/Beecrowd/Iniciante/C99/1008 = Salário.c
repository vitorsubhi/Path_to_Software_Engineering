#include <stdio.h>

int main(){
    int number, hours;
    double value, salary;
    scanf("%d", &number);
    scanf("%d", &hours);
    scanf("%lf", &value);
    salary = value * hours;
    printf ("NUMBER = %d\nSALARY = U$ %.2lf\n", number, salary);
    return 0;
}