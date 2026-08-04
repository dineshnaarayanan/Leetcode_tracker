// Last updated: 8/4/2026, 6:21:56 PM
class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        int n = s.length();
        int[] match = new int[n];
        Arrays.fill(match, -1);

        for (int i = 0; i < indices.length; i++) {
            if (s.startsWith(sources[i], indices[i])) {
                match[indices[i]] = i;
            }
        }

        StringBuilder ans = new StringBuilder();
        int i = 0;

        while (i < n) {
            if (match[i] != -1) {
                ans.append(targets[match[i]]);
                i += sources[match[i]].length();
            } else {
                ans.append(s.charAt(i));
                i++;
            }
        }

        return ans.toString();
    }
}