package com.company;
import java.util.Scanner;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        System.out.println("Пропишите путь к файлу");
        Scanner in = new Scanner(System.in);
        System.out.println();
        String path = in.next();
        System.out.println("Введите имя файла");
        String name = in.next();
        File file =new File(path+"\\"+name);
        try {
            Desktop.getDesktop().open(file);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("Неверный путь или неверное имя файла!");
        }
    }
}
