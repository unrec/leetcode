/*
https://leetcode.com/problems/reverse-integer/
#7
*/

package number;

class ReverseInteger {
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
        } catch (NumberFormatException exc) {
            System.out.println("The value is out of type of range");
            return 0;
        }
    }
}