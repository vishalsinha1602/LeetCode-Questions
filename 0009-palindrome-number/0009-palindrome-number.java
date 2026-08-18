class Solution {
    public boolean isPalindrome(int x) {  
        
    //     if (x < 0) {
    //         return false;
    //     }

    //     int reversed = 0;
    //     int original = x;

    //     while (x != 0) {
    //         int lastDigit = x % 10;
    //         reversed = (reversed * 10) + lastDigit;
    //         x /= 10; 
    //     }

    //     if(original==reversed)
    //         return true;


    // return false;


    String s = String.valueOf(x); // Convert to String
        int n = s.length(); // Store the String length to int n

        for (int i=0; i<n/2; i++) {
            // beginning and from ending are same, if not we return false
            if (s.charAt(i) != s.charAt(n-i-1)) return false;
        }

        return true;
    }
        
    
}