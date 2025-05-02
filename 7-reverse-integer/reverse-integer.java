class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        String num = Integer.toString(Math.abs(x));
        String y = "";
        boolean started = false;

        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if (ch != '0') {
                started = true;
                y += ch;
            } else {
                if (started) {
                    y += ch;
                }
            }
        }

        if (y.equals("")) return 0;

        if (isNegative) {
            y = "-" + y;
        }

        try {
            return Integer.parseInt(y);
        } catch (NumberFormatException e) {
            return 0; // Handle overflow
        }
    }
}
