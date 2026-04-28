## Problem: Move Zeroes

**Question:**  
Given an integer array `nums`, move all `0`s to the end of it while maintaining the relative order of the non-zero elements.  
You must do this in-place without making a copy of the array.

**Example:**
Input: nums = [0,1,0,3,12]  
Output: [1,3,12,0,0]

---

### Solution (Java)

```java
class Solution {
    public void moveZeroes(int[] nums) {
        // Pointer 'left' keeps track of the position 
        // where the next non-zero element should be placed.
        int left = 0;

        // Traverse the array with 'right' pointer
        for (int right = 0; right < nums.length; right++) {
            // If the current element is non-zero
            if (nums[right] != 0) {
                // Swap the non-zero element at 'right' with the element at 'left'
                int temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;

                // Move 'left' forward to the next position
                left++;
            }
        }
    }
}
// ----------------------------------------------------
// Complexity Analysis
// Time Complexity: O(n)
// - We traverse the array once, each operation inside the loop is constant time.
//
// Space Complexity: O(1)
// - Only a few extra variables are used (left, right, temp), no additional data structures.
// ----------------------------------------------------

