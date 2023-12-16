
class Solution {
    public boolean containsDuplicate(int[] nums) {
        //create a HashSet, the reason is that hash sets only have distinct numbers. It cannot have any duplicates.
        HashSet<Integer> distinct = new HashSet<Integer>();
        //loop through the array 
        for(int i = 0; i < nums.length; i++){
            //if the HashSet already contains the number return true because that means there are duplicates in the array 
            if(distinct.contains(nums[i])){
                return true;
            }
            else{
                //add the number to the HashSet if the HashSet does already contain that number
                distinct.add(nums[i]);
            }
        }
        //if true is never returned, return false because that means that every item in the array is distinct.
        return false;
    }
}
