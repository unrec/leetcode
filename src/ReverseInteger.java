

class Solution {
    public int reverse(int x) {
        try {
            Integer t = x;
            String str;

            StringBuffer buffer = new StringBuffer(t.toString());
            buffer.reverse();
            str = buffer.toString();
            if (str.charAt(str.length() - 1) == '-') str = "-" + str.substring(0, str.length() - 1);
            t = Integer.valueOf(str);
            return t;
    }
        catch (NumberFormatException exc) {
            System.out.println("The value is out of type of range");
            return 0;
        }
    }
}

class ReverseInteger{
    public static void main(String args[]){
        int nmbr = 123456;
        Solution sol = new Solution();
        System.out.println("Original number: " + nmbr + "\nReversed number: " + sol.reverse(nmbr));
    }
}