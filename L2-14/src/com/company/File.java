package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class File {
    public static void readerFirst(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь до файла: ");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(in.nextLine()), StandardCharsets.UTF_8))){
            String line;
            String str= new String();
            String [] words;
            while ((line = reader.readLine()) != null) {
                str+=line+"\n";
            }
            if (str.isEmpty()) System.out.println("Файл пустой");
            else {
            str = str.substring(0, str.length() - 1);
            if(!str.contains("\n")){
            words= str.split(" ");
            First Massive = new First(words, words.length);}
            else throw new Exception("ОШИБКА: В файле записан НЕ массив слов! " +
                    "В файле должны быть записан слова в одну строчку через пробел");
            }
        } catch (FileNotFoundException e) {
            System.err.println("ВНИМАНИЕ:Введён неверный путь до файла");
        }
        catch (Exception e){
           System.err.println("ОШИБКА: Неккоректные данные");
        }
    }

    public static void readerSecond(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь до файла: ");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(in.nextLine()), StandardCharsets.UTF_8))){
            String line;
            String str= new String();
            while ((line = reader.readLine()) != null) {
                str+=line+"\n";
            }
            if(str.isEmpty()) System.out.println("Файл пустой");
            else{
            str = str.substring(0, str.length() - 1);
            if(!str.toString().contains("\n")){
                Second stroka = new Second(str.toString());
            }
            else throw new Exception("ОШИБКА: В файле записана НЕ строка!");}
        } catch (FileNotFoundException e) {
           System.err.println("ВНИМАНИЕ:Введён неверный путь до файла");
        }
        catch (Exception e){System.err.println("ОШИБКА: Неккоректные данные");}
    }

    public static void writerSecond(String str, int k){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь до файла: ");
        try {
            PrintWriter writer = new PrintWriter(in.nextLine(), "UTF-8");
            writer.println(str);
            writer.println("Количество предложений: "+ k);
            writer.close();
        }
        catch (IOException e){
            System.err.println("ВНИМАНИЕ:Введён неверный путь до файла");
        }

    }

    public static void writerFirst(String[] words, int n){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите путь до файла: ");
        try {
            PrintWriter writer = new PrintWriter(in.nextLine(), "UTF-8");
            for (int i=0;i<n;i++)
                writer.println(words[i]+"("+words[i].length()+")");
            writer.close();
        }
        catch (IOException e){
            System.err.println("ВНИМАНИЕ:Введён неверный путь до файла");
        }
    }
}
