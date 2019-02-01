package com.company;

public class CaesarDecrypt {
    public static String decrypt(String planText, int shift) {
        if (shift > 26)
            shift = shift % 26;
        else if (shift < 0)
            shift = (shift % 26) + 26;  // посмтотреть почему так
        String cipherText = "";
        int length = planText.length();
        for (int i = 0; i < length; i++) {
            char ch = planText.charAt(i); //возвращает символ, расположенный по указанному индексу строки.
            //проверка на букву
            if (Character.isLetter(ch)) { // проверка на букву
                if (Character.isLowerCase(ch)) { //проверка на нижний регистр
                    char c = (char) (ch - shift); //сдвиг буквы на заданный промежуток
                    if (c < 'a') { // смотрим по таблице ASCII
                        cipherText += (char) (ch + (26 - shift));
                    } else {
                        cipherText += c;
                    }
                } else if (Character.isUpperCase(ch)) { //проверка на верхний регистр
                    char c = (char) (ch - shift); //сдвиг буквы на заданный промежуток
                    if (c < 'A') { // смотрим по таблице ASCII
                        cipherText += (char) (ch + (26 - shift));
                    } else {
                        cipherText += c;
                    }
                }

            } else {
                int ascii = (int) ch; // номер символа в таблице ASCII
                if ((char)ascii-shift<'0'){
                    cipherText += (char)(ascii+(10-shift));
                }
                else
                    cipherText+= (char)(ascii-shift);


            }


        }
        return cipherText;
    }
}
