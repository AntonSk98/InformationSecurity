package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Caesar Cipher");
        System.out.println("ENCRYPT!!");
        System.out.println("Enter the string");
        Scanner in = new Scanner(System.in);
        String  st= in.nextLine();
        while (CheckString.checkString(st)){
            System.out.println("Incorrect row! Please write it without auxiliary characters!");
            System.out.println("Enter the string");
            st= in.nextLine();
        }
        System.out.println("Enter the shift number");
        int shift = in.nextInt();
        String chipher = CaesarEncrypt.encrypt(st, shift);
        System.out.println(chipher);
        System.out.println("DECRYPT!!");
        System.out.println(CaesarDecrypt.decrypt(chipher, shift));

    }
}
