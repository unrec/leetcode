/*
https://leetcode.com/problems/unique-email-addresses
#929
*/

import java.lang.*;
import java.util.*;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] test = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        UniqueEmailAddresses sol = new UniqueEmailAddresses();
//
        System.out.println(sol.numUniqueEmails(test));
    } // end of main

    public int numUniqueEmails(String[] emails) {

        StringBuilder sb = new StringBuilder();
        Set filtered = new HashSet<String>();
        String address;
        String domain;

        for (String email : emails) {
            int ix = email.indexOf('@');
            address = email.substring(0, ix);
            domain = email.substring(ix + 1);
            address = address.replace(".", "");

            if (address.contains("+"))
                address = address.substring(0, address.indexOf('+'));

            sb.append(address).append(domain);
            filtered.add(sb.toString());
            sb.delete(0, sb.length());
        }

        System.out.println(filtered);
        return filtered.size();
    }// end of method
} // end of class
