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
