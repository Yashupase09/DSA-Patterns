// Input: numbers = [2,7,11,15], target = 9
// Output: [1,2]
// Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;
        int sum = 0;
        while(start<end){
            sum = numbers[start] + numbers[end];
            if(sum==target){
                return new int[]{start+1, end+1};
            }else if(sum>target){
                end--;
            }else{
                start++;
            }
        }
        return new int[]{-1, -1};
    }
}
