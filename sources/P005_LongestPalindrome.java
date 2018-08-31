public class P005_LongestPalindrome{
    public String longestPalindrome(String s) {
        if(s.length() <= 1) return s;
        int maxLen = 1, maxLPos = 0, maxRPos = 1;
        for (int i = 1; i <= 2 * s.length() - 3 ; i++) {
            int l = (i % 2 == 0) ? i / 2 - 1: (i - 1) / 2 ; // 字符个数为奇数和偶数的情况
            int r = (i % 2 == 0) ? i / 2 + 1 : (i + 1) / 2; // 初始化l和r的初始为中间位置的左右首个相邻位置
            while (l >= 0  && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLen) {
                    maxLPos = l;
                    maxRPos = r + 1;
                    maxLen = r - l + 1;
                }
                l--;
                r++;
            }
        }
        return s.substring(maxLPos, maxRPos);
    }
}