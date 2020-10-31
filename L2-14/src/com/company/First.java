package com.company;

import java.util.Scanner;

public class First {
    private String[] words;

    public First(){
       words = new String []{"Hello", "world"};
       int n=2;                                                 //Конструктоп по умолчанию
       sort(n);
    }

    public First(String [] words, int n){
        this.words= new String[100];
        for(int i=0;i<n;i++)
            setWords(words, i);                                 //Конструктор с параметрами

        /*for(int i=0;i<n;i++)
            getWords(i);*/

        sort(n);
    }

    public First(First a, int n){
        this.words=a.words;
        System.out.println("Скопированная строка: ");
        for(int i=0; i<n;i++){                                             //Конструктор копирования
         //   this.words[i]=a.words[i];
            System.out.println(this.words[i]);
      }
    }

    public void setWords(String[] words, int i){

        this.words[i]=words[i];                                     //Сеттер сохраняющий массива слов
    }

    public String getWords(int i){
        return words[i];
    }

    public void sort(int n){
        String cur;
        for(int i = 0; i<n-1;i++){
            for(int j = i+1; j< n;j++){
                if(words[i].length()>words[j].length()){          //Метод сортирвки
                    cur=words[i];
                    words[i]=words[j];
                    words[j]=cur;

                }
            }
        }
        chooseKindOfShow(n);
    }

    public void chooseKindOfShow(int n){

        try {
            boolean b=true;
            do {
                System.out.println("         Выберите способ вывода:\n" +
                        "1 - В консоль\n" +
                        "2 - В файл\n" +
                        "0 - Выход из программы");                  //Здесть выбирается метод вывода данных
                Scanner in = new Scanner(System.in);                //Также как и в конструкторе класса Menu
                String k = in.nextLine();                          //Работает NumberFormatException
                switch (Integer.parseInt(k)) {
                    case 1: {
                        show(n);
                        b = false;
                        break;
                    }
                    case 2: {
                        File.writerFirst(words,n);
                        Menu menu=new Menu();
                        b = false;
                        break;
                    }
                    case 0:{
                        System.exit(0);break;}
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
        chooseKindOfShow(n);
        }
        }

    public void show(int n){
        for(int i =0;i<n;i++)
            System.out.println(getWords(i)+"("+getWords(i).length()+")");      //Метод вывода
        Menu menu = new Menu();
    }
}

