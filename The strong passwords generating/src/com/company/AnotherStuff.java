package com.company;
import java.util.Scanner;
import java.io.*;
public class AnotherStuff {
    static int length;
    static int count;
    public static void CheckOfLenght(){ // запрос длины пароя, запрос количества паролей
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("Enter the length of the password: ");
            length=in.nextInt();
            if (length<6)
                System.out.println("Enter longer, please!");
        }while(length<6);
        System.out.println("Enter a count of passwords: ");
        count = in.nextInt();
    }
    public static void Out(char[] Alphabit) { // вывод стойкового пароля в консоль и запись в файл
        PrintWriter out = null;
        try {
            out = new PrintWriter(creation("Result").getAbsoluteFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        for(int i=0; i<count; i++){
            for(int j=0; j<length; j++){
                double rand = Math.random()*62;
                System.out.print(Alphabit[(int)rand]);
                out.print(Alphabit[(int)rand]);

            }
            System.out.println("\n");
            out.print("\r\n");
        }
        out.close();
    }
    public static File creation(String fileName){ //создание файла если файл не создан
        File file = new File (fileName);
        try {
            if(!file.exists()){
                file.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return file;
    }


}

