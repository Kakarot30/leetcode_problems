class Solution {
    public String processStr(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else if (s.charAt(i) == '#') {
                sb = new StringBuilder(duplicate(sb.toString()));
            } else if (s.charAt(i) == '%') {
                sb = new StringBuilder(reverse(sb.toString()));
            } else if (sb.length() > 0) {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }

    private String duplicate(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append(s);
        return sb.toString();
    }

    private String reverse(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.insert(0, s.charAt(i));
        }
        return sb.toString();
    }
}