package com.Samyak;

public class Characterarray {
    //this is the alternate code for "SearchInStrings.java".
    //in this we will not use inbuilt functions and store string into a character array.

    public static void main(String[] args) {
        String name = "Samyak";
        char target = 't';
        System.out.println(searchchar(name, target));
        // we are searching whether u exist in the string or not

    }

    static boolean searchchar(String str, char target) {
        if (str == null || str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == strToCharArray(str)[i]) {
                return true;
            }
        }
        return false;
    }

    // Convert string to character array manually
    static char[] strToCharArray(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
}
