package com.deloitte.lab3ex3;

public class Lab3Ex3 {
    public static String alterStrings(String sb) {
        StringBuilder str = new StringBuilder(sb);

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' && currentChar != 'o' && currentChar != 'u'
                    && currentChar != 'A' && currentChar != 'E' && currentChar != 'I' && currentChar != 'O' && currentChar != 'U') {
                
                str.setCharAt(i, (char) (currentChar + 1));
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String str = "HelloWorldiamasishvowelsareaeiou";
        String replacedStr = alterStrings(str);
        System.out.println(replacedStr);
    }
}
