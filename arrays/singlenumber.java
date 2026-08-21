// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums) {
//         int n = nums.length ;
// int count = 0 ;
// int maxi = 0;
//     for( int i = 0 ;  i < n  ; i++){
        
// if(nums[i] == 1 ){
//   count++;
// }
// else{
//     count = 0 ;
// }
// maxi = Math.max(maxi,count);
//     }
// return maxi;
//     }
// }

class Solution {
    public int singleNumber(int[] nums) {
        int Xorr = 0 ;
        for(int arr : nums){
            Xorr ^= arr;
        }
        return Xorr;
    }
}
