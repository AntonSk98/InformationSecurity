package com.company;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class CheckSumExample {
    private static final String FILENAME = "in.txt";

    private static final String ALGORITHM = "SHA-1";
    public static String CheckSumExample(){
        String cS = new String();
        try {
            // Получаем контрольную сумму для файла в виде массива байт
            final MessageDigest md = MessageDigest.getInstance(ALGORITHM);
            final FileInputStream fis = new FileInputStream(FILENAME);
            byte[] dataBytes = new byte[1024];
            int bytesRead;
            while((bytesRead = fis.read(dataBytes)) > 0) {
                md.update(dataBytes, 0, bytesRead);
            }
            byte[] mdBytes = md.digest();

            // Переводим контрольную сумму в виде массива байт в
            // шестнадцатеричное представление
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < mdBytes.length; i++) {
                sb.append(Integer.toString((mdBytes[i] & 0xff) + 0x100, 16)
                        .substring(1));
            }
            cS = sb.toString();

        } catch (FileNotFoundException | NoSuchAlgorithmException ex) {
            Logger.getLogger(CheckSumExample.class.getName())
                    .log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CheckSumExample.class.getName())
                    .log(Level.SEVERE, null, ex);
        }
        return cS;
    }
}
