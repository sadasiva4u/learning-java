package com.leetcode.google;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Interview_01_UniqueEmailAddresses {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
        System.out.println(numUniqueEmails(new String[]{""}));
        System.out.println(numUniqueEmails(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
        System.out.println(numUniqueEmails(new String[]{"+test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));


        System.out.println(numUniqueEmails_Optimized(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
        System.out.println(numUniqueEmails_Optimized(new String[]{""}));
        System.out.println(numUniqueEmails_Optimized(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}));
        System.out.println(numUniqueEmails_Optimized(new String[]{"+test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }

    static int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email: emails) {
            if(email.isEmpty()){
                continue;
            }
            String address = email.substring(0,email.indexOf('@'));
            String domain = email.substring(email.indexOf('@'));
            address= address.replace(".","");

            if(address.contains("+")) {
                if(address.charAt(0) == '+'){
                    address="";
                }else
                    address = address.substring(0, address.indexOf('+') );
            }

            String validEmail = address+domain;
            if(!validEmail.equals(domain))
            uniqueEmails.add(validEmail);
        }
        System.out.println(uniqueEmails);
        return uniqueEmails.size();
    }

    static int  numUniqueEmails_Optimized(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>();
        for (String email: emails) {
            StringBuilder emailBuilder = new StringBuilder();
            for(int i = 0; i<email.length();i++){
                char c = email.charAt(i);
                if( c == '.'){
                    continue;
                }else if(c == '+'){
                    while(email.charAt(i) != '@'){
                        i++;
                    }
                    emailBuilder.append(email.substring(i));
                } else{
                    emailBuilder.append(c);
                }
            }
            uniqueEmails.add(emailBuilder.toString());
        }
        System.out.println(uniqueEmails);
        return uniqueEmails.size();
    }
}
