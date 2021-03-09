/*
https://leetcode.com/problems/jewels-and-stones
#771
*/

package string;

public class JewelsStones {
    public int numJewelsInStones(String J, String S) {
        int counter = 0;

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (J.contains(Character.toString(c)))
                counter++;
        }
        return counter;
    }
}