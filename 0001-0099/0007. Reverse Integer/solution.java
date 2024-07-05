class Solution {
   public int reverse(int x) {
        int num = Math.abs(x);
        int reverse = 0, remainder = 0;
        while(num>0){
            remainder = num%10;
            num=num/10;

            /*
            * Overflow/Underflow Check:
            Before updating reversed, check if reversed will overflow or underflow after multiplying by 10 and adding digit.
            If reversed is greater than Integer.MAX_VALUE / 10, multiplying it by 10 will cause an overflow.
            If reversed is less than Integer.MIN_VALUE / 10, multiplying it by 10 will cause an underflow.
            Additionally, if reversed is exactly equal to Integer.MAX_VALUE / 10, adding any digit greater than 7 will cause an overflow (since Integer.MAX_VALUE is 2147483647).
            Similarly, if reversed is exactly equal to Integer.MIN_VALUE / 10, adding any digit less than -8 will cause an underflow (since Integer.MIN_VALUE is -2147483648).
            * */
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE/10 && remainder > 7)){
                return 0;
            }
            if (   reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE/10 && remainder < -8)){
                return 0;
            }

            reverse = reverse * 10 + remainder;

        }
        return x > 0 ? reverse : reverse*-1;
    }
}