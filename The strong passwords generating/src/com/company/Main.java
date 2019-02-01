package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        FillOfLetters mas1 = new FillOfLetters(); //создаем объект
        mas1.FillOfLetters(mas1.getAlphabet()); //заполняем обхект алфавитом
        AnotherStuff.CheckOfLenght(); //
        AnotherStuff.Out(mas1.getAlphabet()); // реализация вывода алфавита в консоль и запись в файла
    }
}
