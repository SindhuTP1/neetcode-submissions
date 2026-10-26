class Solution {
    public boolean validPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int n=s.length();
        int left=0;
        int right=n-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return reverse (s,left+1,right)|| reverse(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean reverse(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
        right--;
        }
            return true;

    }
}