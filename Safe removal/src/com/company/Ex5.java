package com.company;

import java.io.*;
import java.util.Scanner;
import java.util.Random;
public class Ex5 {
    private static String inStr = new String();
    public static String in() throws IOException {
        String in = new String();
        FileReader fr = new FileReader("in.txt");
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine()) {
            in = in + sc.nextLine();
        }
        fr.close();
        inStr=in;
        System.out.println(inStr.length());
        return in;
    }
    public static void replace() throws IOException {
        Random random = new Random();
        FileWriter nFile = new FileWriter("in.txt");
        for (int i=0; i<inStr.length(); i++){
            nFile.write(Integer.toString(random.nextInt(9)));
        }
        nFile.close();



    }
    public static void delete(){
        File file = new File("in.txt");
        if(file.delete()){
            System.out.println("in.txt файл удален");
        }else System.out.println("Файла in.txt не обнаружено");
    }
}
