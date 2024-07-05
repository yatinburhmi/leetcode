class Solution {
       public boolean isPalindrome(int x) {
        int num = Math.abs(x);
        int reverse = 0, remainder = 0;
        while(num > 0){
            remainder = num%10;
            num = num/10;
            reverse = reverse*10 + remainder;
        }
        if(reverse == x){
            return  true;
        }
        return  false;
    }
}