package com.company;

import java.util.Scanner;

public class Second {
    private String str;
    private String[] words;
    private static int how_words, how_much;

    public Second(){
        str="Hello world. I miss you.";                        //Конструктор поумолчанию
        setStr(str);
        how_much =2;
        how_words= 5;
        sort();
        show();
    }

    public Second(String str) {
        words = new String[100];
        this.str = str + " ";
        setStr(str);
        words = longwords();                                    //Конструктор с параметром
        how_words = getHowwords();

        how_much = sentence();
        sort();
        show();
    }

    public Second(Second a){
        this.str=a.str+" ";                                    //Конструктор копирования
        System.out.println("Скопированная строка: " +this.str);

    }

    public String getStr(){
        return str;
        //геттер для строки
    }

    public void setStr(String str){
        this.str=str+" ";
        //Сеттер для строки
    }

    public int getHowwords(){
        return how_words;
        //Геттер для how_words
    }

    public void setHowwords(int how_words){
        this.how_words=how_words;
    }

    public int getHowmuch(){
        return how_much;
    }

    public void setHowmuch(int how_much){
        this.how_much=how_much;
    }

    /*public String[] delwords(){
        String s = getStr();
        words = s.split("[. ]");
        return words;}*/

    public String[] longwords(){
        String s = getStr();
        words = s.split("[. ]+");
        setHowwords(this.words.length);                                    //метод деления строки слова
        sort();
        return words;
    }

    public void sort(){
        String cur;
        for(int i = 0; i<getHowwords()-1;i++){
            for(int j = i+1; j< getHowwords();j++){
                if(words[i].length()>words[j].length()){                    //Метод сортировки
                    cur=words[i];
                    words[i]=words[j];
                    words[j]=cur;

                }
            }
        }

    }

    public int sentence(){
        int before, after;
        String str = getStr();
        before=str.length();
        str=str.replaceAll("\\.", "");
        str=str.replaceAll("\\?", "");                      //Метод подсчёта количества предложений
        str=str.replaceAll("!", "");
        after=str.length();
        setHowmuch(before-after);
        return before-after;
    }

    public int chooseKindOfShow(){
        String k = null;
        try {
            boolean b=true;
            do {
                System.out.println("         Выберите способ вывода:\n" +
                        "1 - В консоль\n" +
                        "2 - В файл\n" +
                        "0 - Выход из программы");
                Scanner in = new Scanner(System.in);
                 k = in.nextLine();
                switch (Integer.parseInt(k)) {
                    case 1: {
                        return 1;
                    }
                    case 2: {
                        return 2;
                    }
                    case 0:
                        System.exit(0);
                    default:
                        System.err.println("ОШИБКА:Вы ввели цифру, которая не прелагается для " +
                                "выбора действия, попробуйте ещё раз");
                }
            }
            while (b = true);

        }
        catch(Exception NumberFormatException){
            System.err.println("ОШИБКА:Вы ввели неизвистный символ..." +
                    "Введите 1, 2 или 0 соответсвенно действую" +
                    ",которое вы хотите выполнить");
            chooseKindOfShow();}
        return 4;
    }

    public void show(){
        int k;
        String str_total = new String();
        for(int i =0;i<getHowwords();i++) {
            words[i] = words[i].replaceAll("!", "");
            words[i] = words[i].replaceAll("\\?", "" );         //Метод вывода
            str_total+=words[i]+" ";
        }
        k=chooseKindOfShow();
        if(k==1){
        System.out.println("Отсортированная строка: " + str_total);
        System.out.println(getHowmuch()+" - Кол-во предложений в строке ");
        }
        else if(k==2) File.writerSecond(str_total,getHowmuch());
        Menu menu=new Menu();
  }
}
