#include <stdio.h>

int dp[11];

int main() {
    int t;
    int n;
    
    scanf("%d", &t);
    
    dp[1] = 1;
    dp[2] = 2;
    dp[3] = 4;

    for (int j = 4; j <= 10; j++) {
        dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
    }

    for (int i = 0; i < t; i++) {
        scanf("%d", &n);
        printf("%d\n", dp[n]);
    }
    
    return 0;
}
