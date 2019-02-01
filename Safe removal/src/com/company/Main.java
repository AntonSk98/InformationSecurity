package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        System.out.println("Прочитанный текст из файла: "+Ex5.in());
        Ex5.replace(); //замена на случайные числа
        Ex5.delete(); // удаление файла
    }
}
