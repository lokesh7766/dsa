class Solution {
    public int secondLargestElement(int[] nums) {
        
 int largest = -1;
 int secondlargest = -1;


 for( int num : nums ){
if(num > largest){
    num = largest;
}
 }
 for( int num : nums){
    if(num != largest && num > secondlargest){

        num = secondlargest;

    }
 
 }

    return secondlargest;

}

}