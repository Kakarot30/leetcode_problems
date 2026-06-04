class Solution {
    public int totalWaviness(int num1, int num2) {
        int total =0;
        for(int i=num1;i<=num2;i++){
            total+=getWaviness(i);
        }
        return total;
    }
    private int getWaviness(int x){
        String s = Integer.toString(x);
        int score = 0;
        for(int i=1;i<s.length()-1;i++){
            if(s.charAt(i)>s.charAt(i-1)&&s.charAt(i)>s.charAt(i+1)) score++;
            if(s.charAt(i)<s.charAt(i-1)&&s.charAt(i)<s.charAt(i+1)) score++;
        }
        return score;
    }
}