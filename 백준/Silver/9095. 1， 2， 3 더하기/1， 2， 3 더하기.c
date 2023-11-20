#include <stdio.h>

int main() {
    int t, n, dp[11] = {0, 1, 2, 4};
    
    for (int j = 4; j <= 10; j++) dp[j] = dp[j - 3] + dp[j - 2] + dp[j - 1];
    
    for (scanf("%d", &t); t--; printf("%d\n", dp[n])) scanf("%d", &n);
    
    return 0;
}
