/* https://leetcode.com/problems/longest-palindromic-substring/submissions/1753304915/
*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        System.out.println(longestPalindrome("ccc"));
    }
    
    public static String longestPalindrome(String s) {
        String palindrome = "";

        if(s.length() == 1){
            return s;
        }
        if(s.length() == 2 && isPalindrome(s)){
            return s;
        }
        for(int i=0; i < s.length(); i++){
           
            for(int j = i+1; j < s.length(); j++){
                String x = s.substring(i,j);
                System.out.println("x "+x);
                if(isPalindrome(x) && x.length() > palindrome.length() ){
                    palindrome = x;
                }
            }
            
        }

        System.out.println("palindrome : "+palindrome);
     
        return palindrome;
    }

    public static boolean isPalindrome(String s){
        int j = s.length()-1;
        int i=0;
        boolean isPalin = true;
        while(i<s.length() ){
         
            if(s.charAt(i) != s.charAt(j)){
                isPalin = false;
                break;
            }
            i++;
            j--;
        }
        System.out.println("index : "+i+" "+j);
        System.out.println("isPalin : "+isPalin);
        return isPalin;
    }
}
