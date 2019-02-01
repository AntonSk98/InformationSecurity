package com.company;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String txt = scanner.next();
	    System.out.println("Введите имя изображения: ");
        try {
            BufferedImage img = ImageIO.read(new File(scanner.next()));
            Encoder.encode(img,txt);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Данные извлеченные из изображения");
        System.out.println("Введите имя изображения из которого извлечь данные: ");
        try {
            Decoder.extractText(ImageIO.read(new File("textEmbedded.png")), txt.length());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
