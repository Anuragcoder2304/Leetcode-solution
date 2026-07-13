class Solution {
    public int subtractProductAndSum(int n) {
        int result1 = 1;
        int result2 =0;
        while(n>0){
            int temp = n%10;
            result1 = result1 * temp;
            result2 = result2 + temp;
            n = n/10;
        }
        int result = result1 - result2;
        return result;
        
    }
}