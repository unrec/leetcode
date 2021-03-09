/*
https://leetcode.com/problems/unique-email-addresses
#929
*/

package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] test = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        UniqueEmailAddresses sol = new UniqueEmailAddresses();

        System.out.println(sol.numUniqueEmails(test));
    }

    public int numUniqueEmails(String[] emails) {
        StringBuilder sb = new StringBuilder();
        Set<String> filtered = new HashSet<>();
        String address;
        String domain;

        for (String email : emails) {
            int ix = email.indexOf('@');
            address = email.substring(0, ix);
            domain = email.substring(ix + 1);

            if (address.contains("+"))
                address = address.substring(0, address.indexOf('+'));

            sb.append(address).append(domain);
            filtered.add(sb.toString());
            sb.delete(0, sb.length());
        }
        return filtered.size();
    }
}
