class Solution:
    def smallestNumber(self, n: int, t: int) -> int:
        def helper(num):
            prod=1

            for digit in str(num):
                prod*=int(digit)

            return prod
        
        while helper(n) % t !=0:
            n+=1
        
        return n