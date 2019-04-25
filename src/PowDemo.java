

class Solution50 {
    public double myPow(double x, int n) {

        double base = x;
        int power = n;

        double sum = 1;
        int abs;

        if (x==0) return 0;
        if (n==0 || x==1) return 1;
        if (n==1) return base;

        abs = n <0? -n : n;

        for (int i = 0; i < abs; i++){
            sum *= base;
        }

        if (n < 0) return (1/sum);
        return sum;
    }
}

class PowDemo {
    public static void main(String[] args) {
        Solution50 sol = new Solution50();
        double x = 10;
        int n = 5;

        double res = sol.myPow(x, n);
        System.out.println(x + " raised in " + n + " power is " + res);
    }
}