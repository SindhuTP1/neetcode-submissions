class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;

        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return remove(s,left+1,right)||remove(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;

    }
        public boolean remove(String s,int left,int right){
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