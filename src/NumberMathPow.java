/*
https://leetcode.com/problems/powx-n
#50
*/

public class NumberMathPow {
    public static void main(String[] args) {

        NumberMathPow pow = new NumberMathPow();
        System.out.println(pow.myPow(12, 12));
        System.out.println(Math.pow(12, 12));
    }

    public double myPow(double x, int n) {
        if (x == 0) return 0;
        if (x == 1 || n == 0) return 1;
        if (n == 1) return x;
        if (n == 2) return x * x;

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        if (n % 2 == 0) return myPow(myPow(x, n / 2), 2);
        else return x * myPow(myPow(x, n / 2), 2);

    } // end of method
} // end of class