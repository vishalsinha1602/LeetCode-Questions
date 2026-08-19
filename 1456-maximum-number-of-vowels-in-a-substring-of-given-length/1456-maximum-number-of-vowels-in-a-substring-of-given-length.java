class Solution {
    public int maxVowels(String s, int k) {

        int left =0;
        int right = k-1;
        int count =0;

        for(int i =left ; i<=right ; i++)
        {
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            count ++;

        } 
        int maxCount = count;

        while(right<s.length()-1)
        {

            char leftChar = s.charAt(left);

            if(leftChar == 'a' || leftChar == 'e' ||
               leftChar == 'i' || leftChar == 'o' ||
               leftChar == 'u') {
                count--;
            }
            left++;
            right++;

                        char rightChar = s.charAt(right);

            if(rightChar == 'a' || rightChar == 'e' ||
               rightChar == 'i' || rightChar == 'o' ||
               rightChar == 'u') {
                count++;
            }

            maxCount = Math.max(maxCount, count);

        }   

        return maxCount;   
    }
}