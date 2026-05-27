class Solution {
    public int numberOfSpecialChars(String word) {
        int n = word.length();
        int count =0;

        int[] lastOcc = new int[26];
        int[] firstOcc = new int[26];

        Arrays.fill(lastOcc,-1);
        Arrays.fill(firstOcc,-1);

        for(int i=0;i<n;i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                lastOcc[ch-'a']=i;
            }else{
                if(firstOcc[ch-'A']==-1){
                    firstOcc[ch-'A']=i;
                }
            }
        }
        for(int i=0;i<26;i++){
            if(lastOcc[i]!=-1&&firstOcc[i]!=-1&&lastOcc[i]<firstOcc[i]){
                count++;
            }
        }
        return count;
    }
}