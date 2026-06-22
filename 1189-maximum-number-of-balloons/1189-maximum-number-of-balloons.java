class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] t = new int[26];
        for (char ch : text.toCharArray()) {
            t[ch - 'a']++;
        }
        
        int count = Integer.MAX_VALUE;
        count = Math.min(count, t['b' - 'a']);
        count = Math.min(count, t['a' - 'a']);
        count = Math.min(count, t['l' - 'a'] / 2);
        count = Math.min(count, t['o' - 'a'] / 2);
        count = Math.min(count, t['n' - 'a']);
        
        return count;
    }
}