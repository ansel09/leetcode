public class P009_IsPalindrome{
    public boolean isPalindrome(int x) {
        int a = x;
        if (a >= 0){
            long reverse = 0;
            while (a != 0){
                reverse = reverse * 10 + (a % 10);
                if (reverse > Integer.MAX_VALUE)    return false;
                a /= 10;
            }
            if(x == reverse) return true;
        }
        return false;
    }
}