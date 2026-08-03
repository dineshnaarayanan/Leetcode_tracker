# Last updated: 8/3/2026, 4:03:13 PM
1class Solution:
2    def minimumDeleteSum(self, s1: str, s2: str) -> int:
3        m, n = len(s1), len(s2)
4        dp = [[0] * (n + 1) for _ in range(m + 1)]
5        for i in range(m - 1, -1, -1):
6            for j in range(n - 1, -1, -1):
7                if s1[i] == s2[j]:
8                    dp[i][j] = ord(s1[i]) + dp[i + 1][j + 1]
9                else:
10                    dp[i][j] = max(dp[i + 1][j], dp[i][j + 1])
11        total = sum(ord(c) for c in s1) + sum(ord(c) for c in s2)
12        return total - 2 * dp[0][0]