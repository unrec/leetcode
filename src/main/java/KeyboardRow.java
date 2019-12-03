/*
https://leetcode.com/problems/keyboard-row
#500
*/

import java.util.List;
import java.util.ArrayList;

public class KeyboardRow {
    public static void main(String[] args) {
        KeyboardRow kb = new KeyboardRow();
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] output = kb.findWords(words);
        for (String word : output) {
            System.out.println(word);
        }
    } // end of main

    public String[] findWords(String[] words) {

        String[] lines = new String[3];
        lines[0] = "qwertyuiopQWERTYUIOP";
        lines[1] = "asdfghjklASDFGHJKL";
        lines[2] = "zxcvbnmZXCVBNM";

        boolean isFound = false;

        List<String> temp = new ArrayList<>();
        String[] output;

        for (String word : words) {
            isFound = false;
            for (String line : lines) {
                if (isFound) break;
                for (int i = 0; i < word.length(); i++) {

                    char current = word.charAt(i);
                    char last = word.charAt(word.length() - 1);

                    if (i == word.length() - 1 && line.contains(Character.toString(last))) {
                        temp.add(word);
                        isFound = true;
                        break;
                    }
                    if (line.contains(Character.toString(current))) continue;
                    else break;
                }
            }
        }
        output = new String[temp.size()];
        output = temp.toArray(output);
        return output;
    } // end of method
} // end of class