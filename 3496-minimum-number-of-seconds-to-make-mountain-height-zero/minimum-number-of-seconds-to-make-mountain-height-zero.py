class Solution:
    def minNumberOfSeconds(self, h: int, a: List[int]) -> int:
        return bisect_left(range(10**16),h,
            key=lambda t:sum((isqrt(1+8*t//ti)-1)//2 for ti in a))