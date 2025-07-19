/*
*  Longest Substring Without Repeating Characters - Leetcode
    Input: s = "geeksforgeeks"
    Output: 7 
    Explanation: The longest substrings without repeating characters are "eksforg” and "ksforge", with lengths of 7.
    
    Input: s = "aaa"
    Output: 1
    Explanation: The longest substring without repeating characters is "a"
    
    Input: s = "abcdefabcbb"
    Output: 6
    Explanation: The longest substring without repeating characters is "abcdef".
*   Brute force method
*/

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        
        String str = "";
        String longestStr = "";
        int idx = 0;

        for(int i=0; i < s.length(); i++){
            if(str.contains(Character.toString(s.charAt(i)))) {
                if(str.length() > longestStr.length()) {
                    longestStr = str;
                    
                }
                str = "";
                    idx ++;
                    i = idx;
                
            } else {
                str = str.concat(Character.toString(s.charAt(i)));
            }
        }

        return longestStr.length();
    }
}
