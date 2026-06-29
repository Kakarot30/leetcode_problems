class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for(String pattern: patterns){
            int pos = word.indexOf(pattern);
            if(pos!=-1){
                count++;
            }
        }
        return count ;
    }
}