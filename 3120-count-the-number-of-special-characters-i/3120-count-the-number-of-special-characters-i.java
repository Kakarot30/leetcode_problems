class Solution {
    public int numberOfSpecialChars(String word) {
        int[] freq = new int[123];

        for(char ch : word.toCharArray()) {
            freq[ch]++;
        }

        int count = 0;
        //ASCII : a : 97 , b = 98 ..... 122 : z
        //ASCII : A : 65,  B = 66 ..... 90  : Z

        for(int i = 97; i <= 122; i++) { //Iterate from 97 to 122 or 'a' to 'z'
            int capitalIndex = i - 32; //A... Z

            if(freq[i] > 0 && freq[capitalIndex] > 0) //Both should be present
                count++;
        }

        return count;
    }
}