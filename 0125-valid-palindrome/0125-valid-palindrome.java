class Solution {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            // Left side ka non-alphanumeric character skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }

            // Right side ka non-alphanumeric character skip karo
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // Characters compare karo
            if (Character.toLowerCase(s.charAt(left)) !=
                Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}