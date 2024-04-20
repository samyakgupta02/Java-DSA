package com.Samyak;

public class SearchInStrings {
    public static void main(String[] args) {

        String name = "Samyak";
        char target = 't';
        System.out.println(searchchar(name, target));
        // we are searching whether u exist in the string or not

    }

    static boolean searchchar(String str,char target){
        if (str.length() == 0){                        //str.length has brackets because this is a function in string class.
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;

    }
}
