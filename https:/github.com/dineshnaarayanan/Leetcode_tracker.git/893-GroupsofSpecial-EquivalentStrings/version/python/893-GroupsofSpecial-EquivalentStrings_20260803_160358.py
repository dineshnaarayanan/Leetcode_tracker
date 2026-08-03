# Last updated: 8/3/2026, 4:03:58 PM
1class Solution:
2    def numSpecialEquivGroups(self, A: List[str]) -> int:
3        res = set()
4        for s in A:
5            sort_odd_even = ''.join(sorted(s[1::2]) + sorted(s[::2]))
6            res.add(sort_odd_even)
7        return len(res)