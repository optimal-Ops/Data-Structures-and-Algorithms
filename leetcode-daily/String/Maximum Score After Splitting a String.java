/*
 1. Traverse the string to count the number of 1's, so we know the count of 1's in the right part.
 2. Iterate through the string from 0 to n-2 (n-2 because we need non-empty substrings).
    If the character is '0', increment zerosum; otherwise, decrement onesum and track the maxScore.
 */

class Solution {
    public int maxScore(String s) {
        int onesum = 0;
        int zerosum = 0;
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                onesum++;
            }
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                zerosum++;
            } else {
                onesum--;
            }
            res = Math.max(res, zerosum + onesum);
        }

        return res;
    }
}
/*
TC=O(2n)
sc=O(1) 
*/