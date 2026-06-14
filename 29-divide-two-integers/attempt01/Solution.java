class Solution {
    public int divide(int dividend, int divisor) {
        int plusMinus = 1;
        long total = 0L;
        if (dividend < 0 && divisor < 0) {
            dividend *= -1;
            divisor *= -1;
        }
        else if (divisor < 0) {
            divisor *= -1;
            plusMinus = -1;
        }
        else if (dividend < 0) {
            dividend *= -1;
            plusMinus = -1;
        }
        while (dividend > 0) {
            dividend -= divisor;
            if (dividend >= 0) {
                total++;
            }
        }
        total *= plusMinus;
        if (total > (Math.pow(2,31) - 1)) {
            total = (int) (Math.pow(2,31) - 1);
        }
        if (total < (Math.pow(-2,31))) {
            total = (int) (Math.pow(-2,31));
        }
        return (int) total;
    }
}