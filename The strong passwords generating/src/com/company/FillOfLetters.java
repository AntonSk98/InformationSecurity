package com.company;
import java.util.Scanner;
public class FillOfLetters {
    char [] Alphabet = new char[62]; //26+26+10;

    public char[] getAlphabet() {
        return Alphabet;
    }

    public void FillOfLetters(char [] Alphabet) //создание Алфавита
    {
        this.Alphabet = Alphabet;
        char beginOfTittle = 'a';
        for (int i=0; i<26; i++)
            Alphabet[i]= beginOfTittle++;
        char secondTitle = 'A';
        for (int i=26; i<52; i++)
            Alphabet[i]= secondTitle++;
        char number = '0';
        for (int i=52; i<62; i++)
            Alphabet[i]= number++;
    }




}
