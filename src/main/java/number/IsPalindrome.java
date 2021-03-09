package number;

public class IsPalindrome {
    public boolean isPalindrome(int x) {
        int num = x;
        int y;
        int n = 1; // number of digits
        int a = 0, b = 0; // right and left parts
        boolean status = false;

        if (num >= 0 && num < 10) return true;
        if (num < 0 || (num % 10) == 0) return false;

        // calculate the number of digits
        for (long i = 10; n < 11; i *= 10) {
            y = (int) (num / i);
            if (y > 0) n++;
            else break;
        }

        // compare left and right digits
        for (int k = 1; k <= n / 2; k++) {
            a = num / ((int) Math.pow(10, (n - k))) - 10 * (num / (int) Math.pow(10, (n - k + 1)));
            b = (num % (int) Math.pow(10, (k)) - b) / ((int) Math.pow(10, k - 1));
            if (a == b) status = true;
            else {
                status = false;
                break;
            }
        }
        return status;
    }
}