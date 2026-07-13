class Solution(object):
    def subtractProductAndSum(self, n):
        result1 =1
        result2 =0
        while n>0:
            temp = n % 10
            result1 = result1 * temp
            result2 = result2 + temp
            n = n//10
        result = result1 - result2
        return result
