package com.company;

import java.util.Scanner;

public class Menu {
    public Menu(){
        String s;
        Scanner in = new Scanner(System.in);                        //В этом методе выбирается задание, которое
        while (true) {                                              //Пользователь хочет выполнить
            System.out.println("             Main menu\n1 - Для выполнения задания № 1" + "\n" +
                    "2 - Для выполнения задания № 2 и 3" + "\n" +
                    "0 - Выход из программы");
            s = in.nextLine();                                      //Так как я объявил переменную String, то при
            try {                                                   //Переводе буквы в цифру, произойдёт ошибка
                chooseTask(Integer.parseInt(s));                   //Поэтому я селал NumberFormatException Exception
            } catch (Exception NumberFormatException) {
                System.err.println("ОШИБКА:Вы ввели неизвистный символ..." +
                        "Введите 1, 2 или 0 соответсвенно действую" +
                        ",которое вы хотите выполнить");
            }
        }
    }

    private static void chooseTask(int i){                  //В этом методе выбиирается  способ ввода
        String s;
        Scanner in = new Scanner(System.in);
        boolean b=true;
        switch (i) {
            case 1: {
                do {
                    System.out.println("          Выберите способ ввода:\n1 - Ввод с консоли\n" +
                            "2 - Ввод из файла\n9 - Назад\n" +
                            "0 - Выход из программы");
                    s = in.nextLine();
                    b=chooseActionCaseFirst(s, b);
                } while (b==true);
                break;
            }

            case 2: {
                do {
                System.out.println("       Выберите способ ввода:\n1 - Ввод с консоли\n" +
                        "2 - Ввод из файла\n9 - Назад\n" +
                        "0 - Выход из программы");
                s = in.nextLine();
                b=chooseActionCaseSecond(s, b);
            } while (b==true);
                break;
            }

            case 0: System.exit(0);

            default:{ System.err.println("ОШИБКА:Вы ввели цифру, которая не прелагается для " +
                    "выбора действия, попробуйте ещё раз"); break;}

        }

    }

    private static void task1(){
        String[] words = new String[100];
        Scanner in = new Scanner(System.in);    //Объявления сканера для чтения данных введённых с клавиатуры
        int i=-1;
        System.out.println("Введите массив слов: ");
        do{
            i++;
            words[i]=in.nextLine();             //Ввод массива слов
        }while (!words[i].isEmpty());
        //Задание № 1
        if(i!=0) {
            First Massive = new First(words, i);    //Конструктор с параметром
        } else {
            First Massive = new First();          //Конструктор по умолчанию
        }
        //First Massive2 = new First(Massive,i);   //Конструктор копирования
    }

    private static void task2(){                         //Задание № 2 и 3
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String str= in.nextLine();                     //Ввод строки
        //Second stroka1 = new Second();                //Конструктор по умолчанию
        Second stroka = new Second(str);               //Конструктор с параметром
        //Second stroka2 = new Second(stroka);         //Конструктор копирования
    }

    private static boolean chooseActionCaseFirst(String s, boolean b) {
        try {                                                               //В этом методе обрабатываются данны введённые в
            if(Integer.parseInt(s)==1){ task1(); b=false;}                  //В chooseTask, также аналагично методу Menu
            else if(Integer.parseInt(s)==2){  File.readerFirst(); b=false;} //Здесть есть NumberFormatException
            else if(Integer.parseInt(s)==9) b=false;
            else if(Integer.parseInt(s)==0) System.exit(0);
            else System.err.println("ОШИБКА:Вы ввели цифру, которая не прелагается для " +
                        "выбора действия, попробуйте ещё раз");
        } catch (Exception NumberFormatException) {
            System.err.println("ОШИБКА:\nВы ввели неизвистный символ..." +
                    "Введите 1, 2, 9 или 0 " +
                    "соответсвенно действую,которое вы хотите выполнить");
        }
        return b;
    }

    private static boolean chooseActionCaseSecond(String s, boolean b) {
        try {                                                           //В этом методе обрабатываются данны введённые в
            if(Integer.parseInt(s)==1){ task2(); b=false;}                 //В chooseTask, также аналагично методу Menu
            else if(Integer.parseInt(s)==2){  File.readerSecond(); b=false;}//Здесть есть NumberFormatException
            else if(Integer.parseInt(s)==9) b=false;
            else if(Integer.parseInt(s)==0) System.exit(0);
            else System.err.println("ОШИБКА:Вы ввели цифру, которая не прелагается для " +
                        "выбора действия, попробуйте ещё раз");;
        } catch (Exception NumberFormatException) {
            System.err.println("ОШИБКА:\nВы ввели неизвистный символ..." +
                    "Введите 1, 2, 9 или 0 " +
                    "соответсвенно действую,которое вы хотите выполнить");
        }
        return b;
    }
}

