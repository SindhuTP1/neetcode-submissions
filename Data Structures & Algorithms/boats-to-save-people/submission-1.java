class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n=people.length;
        int left=0;
        int right=n-1;
        int count=0;

        Arrays.sort(people);

        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;

            }
            count++;
            right--;
        }
        return count;
    }
}