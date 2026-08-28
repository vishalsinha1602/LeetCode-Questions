class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        // List<Integer> res = new ArrayList<>();

        // int n = s.length();
        // int k = p.length();

       
        // int[] pCount = new int[26];

        // for (char c : p.toCharArray()) {
        //     pCount[c - 'a']++;
        // }

       
        // for (int i = 0; i <= n - k; i++) {

         
        //     int[] sCount = new int[26];

        //     for (int j = i; j <= i + k - 1; j++) {
        //         sCount[s.charAt(j) - 'a']++;
        //     }

        //     // Agar dono ka frequency same hai
        //     if (Arrays.equals(pCount, sCount)) {
        //         res.add(i);
        //     }
        // }

        // return res;

        List<Integer> res = new ArrayList<>();

        // If p is bigger than s, anagram is impossible
        if (s.length() < p.length()) {
            return res;
        }

       
        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> sMap = new HashMap<>();

        // Build frequency map for p
        // a:1
        // b:1
        // c:1
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;

        // Number of characters that still need to match
        int count = p.length();

        // Expand window using right
        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            // Add current character to window
            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

            // If this character is required by p
            // and we haven't taken more than required
            if (pMap.containsKey(ch) &&
                sMap.get(ch) <= pMap.get(ch)) {

                count--;
            }

            // Window is bigger than p
            if (right - left + 1 > p.length()) {

                char leftChar = s.charAt(left);

                // If removing this character means
                // we lose one required character
                if (pMap.containsKey(leftChar) &&
                    sMap.get(leftChar) <= pMap.get(leftChar)) {

                    count++;
                }

                // Remove left character from window
                sMap.put(leftChar, sMap.get(leftChar) - 1);

                // Move left forward
                left++;
            }

            // All characters matched
            if (count == 0) {
                res.add(left);
            }
        }

        return res;

    }
}