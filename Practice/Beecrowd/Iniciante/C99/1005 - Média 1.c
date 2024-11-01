//Time Complexity: θ(1)
//Space Complexity: θ(1)
#include <stdio.h>

int main(){
    double A, B, MEDIA;
    scanf ("%lf", &A);
    scanf ("%lf", &B);
    MEDIA = (((A * 0.35) + (B * 0.75)) * 10.0) / 11.00;
    printf ("MEDIA = %.5f\n", MEDIA);
    return 0;
}
