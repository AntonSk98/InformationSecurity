package com.company;
import com.company.Cypher;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
            System.out.println("Введите текст для шифрования: ");
            Scanner scanner = new Scanner(System.in);
            String line = scanner.next();
            System.out.println("Введите чило групп: ");
            int parts = scanner.nextInt();
            System.out.println("Введите правило перестановки: ");
            int[] sequence = new int[parts];

            for(int i = 0; i < parts; ++i) {
                sequence[i] = scanner.nextInt();
            }

            try {
                String y = Cypher.encode(line, sequence);
                String z = Cypher.decode(y, sequence);
                System.out.print("Encode: ");
                System.out.println(y);
                System.out.print("Decode: ");
                System.out.println(z);
            } catch (Exception var7) {
                System.out.println(var7.getMessage());
            }


    }
}
