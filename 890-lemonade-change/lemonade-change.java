class Solution {
    public boolean lemonadeChange(int[] bills) {
        int cnt_five = 0;
        int cnt_ten = 0;

        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                cnt_five++;
            } else if (bills[i] == 10) {
                if (cnt_five >= 1) {
                    cnt_five--;
                    cnt_ten++;
                } else {
                    return false;
                }
            } else if (bills[i] == 20) {
                if (cnt_ten >= 1 && cnt_five >= 1) {
                    cnt_ten--;
                    cnt_five--;
                } else if (cnt_five >= 3) {
                    cnt_five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
