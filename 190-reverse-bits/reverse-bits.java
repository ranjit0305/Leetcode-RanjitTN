class Solution {
    public int reverseBits(int n) {
        String bin = Integer.toBinaryString(n);
        while (bin.length() < 32) {
            bin = "0" + bin;
        }
        StringBuilder temp = new StringBuilder(bin);
        temp = temp.reverse();
        long n1 = Long.parseLong(temp.toString(), 2);
        return (int) n1;
    }
}
