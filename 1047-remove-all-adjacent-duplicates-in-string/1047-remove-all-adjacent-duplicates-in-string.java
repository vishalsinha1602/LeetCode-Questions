class Solution {
    public String removeDuplicates(String s) {

        Deque<Character> st = new ArrayDeque<>();

        for (char c : s.toCharArray()) {

            if (!st.isEmpty() && st.peek() == c) {
                st.pop();
            } else {
                st.push(c);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.removeLast());
        }

        return ans.toString();
    }
}