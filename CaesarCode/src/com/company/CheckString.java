package com.company;

public class CheckString {
    public static boolean checkString(String string){ // проверка на служебные недопустимые символы в пароле
        final char signs[]={' ', '!', '"', '£', '$', '%', '#', '^', '&', '*', ')', '(', '_', '-', '~', '@'};
        int length = string.length();
        int count = 0;
        for (int i=0; i<length; i++){
            char ch = string.charAt(i);
            for (int j=0; j<signs.length; j++){
                if (ch == signs[j])
                    count=+1;
            }
        }
        if (count>=1)
            return true;
        else
            return false;
    }

}
