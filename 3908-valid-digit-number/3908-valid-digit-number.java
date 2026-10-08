class Solution {
    public boolean validDigit(int n, int x) {
        boolean hasX = false;

        while (n > 9) {
            if (n % 10 == x) {
                hasX = true;
            }

            n = n / 10;
        }
        return hasX && n != x;
    }
}