class Solution {
    public String longestPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int maxL = 0;
        for (int i = 0; i < charArray.length; i++) {
            for (int len = 0; i + len < charArray.length; len++) {
                if (isPalindrome(charArray, i, len) && len + 1 > maxL) {
                    maxL = len + 1;
                    start = i;
                }
            }
        }

        return s.substring(start, start + maxL);
    }
    
    public boolean isPalindrome(char[] charArray, int start, int len) {
        while (len > 0) {
            if (charArray[start] != charArray[start + len]) {
                return false;
            }

            start++;
            len -= 2;
        }

        return true;
    }
}
