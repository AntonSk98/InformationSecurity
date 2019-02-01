package com.company;

import java.awt.image.BufferedImage;

public class Decoder {
    public static void extractText(BufferedImage image, int length) {
        System.out.print("Extracting: ");
        int bitMask = 0x00000001;	// define the mask bit used to get the digit
        int x = 0;					// define the starting pixel x
        int y = 0;					// define the starting pixel y
        int flag;
        char[] c = new char[length] ;	// define a character array to store the secret information
        for(int i = 0; i < length; i++) {
            int bit = 0;

            // 8 digits form a character
            for(int j = 0; j < 8; j++) {
                if(x < image.getWidth()) {
                    flag = image.getRGB(x, y) & bitMask;	// get the last digit of the pixel
                    x++;
                }
                else {
                    x = 0;
                    y++;
                    flag = image.getRGB(x, y) & bitMask;	// get the last digit of the pixel
                }

                // store the extracted digits into an integer as a ASCII number
                if(flag == 1) {
                    bit = bit >> 1;
                    bit = bit | 0x80;
                }
                else {
                    bit = bit >> 1;
                }
            }
            c[i] = (char) bit;	// represent the ASCII number by characters
            System.out.print(c[i]);
        }
    }
}
