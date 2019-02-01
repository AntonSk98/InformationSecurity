package com.company;
import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        int decision;
        Scanner in = new Scanner(System.in);
        System.out.println("Исходная контрольная сумма "+ CheckSumExample.CheckSumExample());
        System.out.println("Хотите произвести записть в файл контрольной суммы? (1/0)");
        decision=in.nextInt();
        if (decision==1){
            WriteAndCompare.write(CheckSumExample.CheckSumExample());
            System.out.println("Контрольная сумма "+CheckSumExample.CheckSumExample()+" была записана в файл");}
        else{
            if(WriteAndCompare.compare(CheckSumExample.CheckSumExample())){
            System.out.println("Модификация файла не проводилась");
            }
            else
                System.out.println("Содержимое файла было изменено");
    }
}}
