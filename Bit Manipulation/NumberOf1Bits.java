/*Given a positive integer n, write a function that returns the number of set bits in its binary representation (also known as the Hamming weight).

 

Example 1:

Input: n = 11

Output: 3

Explanation:

The input binary string 1011 has a total of three set bits.*/
class Solution {
    public int hammingWeight(int n) {

        int count = 0;
        while (n != 0) {
            count += (n & 1); // check last bit
            n >>>= 1;         // unsigned right shift
        }
        return count;
        // int sum = 0;
        // while(n!=0){
        //    sum = sum +(n%2);
        //    n = n / 2;
        // }
        // return sum;
    }
}
