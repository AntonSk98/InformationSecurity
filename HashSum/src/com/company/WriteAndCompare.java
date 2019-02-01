package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteAndCompare {
    public static void write(String cS) throws IOException {
        FileWriter nFile = new FileWriter("on.txt");
        nFile.write(cS);
        nFile.close();
    }
    public static boolean compare(String cS) throws IOException {
        String in = new String();
        FileReader fr = new FileReader("on.txt");
        Scanner sc = new Scanner(fr);

        while (sc.hasNextLine()) {
            in = in + sc.nextLine();
        }
        fr.close();
        String inStr = in;
        if (cS.equals(inStr))
            return true;
        else
            return false;

    }
}
