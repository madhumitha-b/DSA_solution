class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        s = s.toLowerCase();

        while (left <= right) {

            if (Character.isLetterOrDigit(s.charAt(left)) &&
                Character.isLetterOrDigit(s.charAt(right))) {

                if (s.charAt(left) != s.charAt(right)) {
                    return false;
                }

                left++;
                right--;
            }
            else if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else {
                right--;
            }
        }

        return true;
    }
}