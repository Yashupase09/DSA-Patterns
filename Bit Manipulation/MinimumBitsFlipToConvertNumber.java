/*Input: start = 10, goal = 7
Output: 3
Explanation: The binary representation of 10 and 7 are 1010 and 0111 respectively. We can convert 10 to 7 in 3 steps:
- Flip the first bit from the right: 1010 -> 1011.
- Flip the third bit from the right: 1011 -> 1111.
- Flip the fourth bit from the right: 1111 -> 0111.
It can be shown we cannot convert 10 to 7 in less than 3 steps. Hence, we return 3.*/

class Solution {
    public int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }
}


/*class Solution {
    public int minBitFlips(int start, int goal) {
        int xor = start ^ goal;
        int count = 0;
        while (xor > 0) {
            count += (xor & 1);  // check last bit
            xor >>= 1;           // shift right
        }
        return count;
    }
}
*/

/*class Solution {
    public int minBitFlips(int start, int goal) {
        int flips = 0;
        while (start > 0 || goal > 0) {
            if ((start & 1) != (goal & 1)) {
                flips++;
            }
            start >>= 1;
            goal >>= 1;
        }
        return flips;
    }
}
*/

