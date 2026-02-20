class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine sign of the result
        boolean negative = (dividend < 0) ^ (divisor < 0);

        // Use long to avoid overflow and convert to positive
        long dividendL = Math.abs((long) dividend);
        long divisorL = Math.abs((long) divisor);

        int result = 0;

        // Subtract divisor multiples using bit shifts
        while (dividendL >= divisorL) {
            long tempDivisor = divisorL;
            int multiple = 1;

            // Find the highest double of divisor that fits into dividend
            while (dividendL >= (tempDivisor << 1)) {
                tempDivisor <<= 1;
                multiple <<= 1;
            }

            dividendL -= tempDivisor;
            result += multiple;
        }

        return negative ? -result : result;
    }
}
