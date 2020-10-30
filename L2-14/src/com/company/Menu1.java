/*package com.company;

import java.util.Scanner;

public class Menu1 {
    package com.company;

import java.util.Scanner;

    public class Menu {
        public Menu(){
            String s;
            Scanner in = new Scanner(System.in);
            do { sleep();
                System.out.println("\n1 - для выполнения задания № 1" + "\n" +
                        "2 - для выполнения задания № 2 и 3"+ "\n"+
                        "Для выхода из программы нажмите - 'Enter'");
                s = in.nextLine();
                try { chooseTask(Integer.parseInt(s)); }
                catch (Exception NumberFormatException){ break; }
            }while (!s.isEmpty());
        }

        public static void sleep() {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {
                System.out.println("  ");
            }
        }

        public static void chooseTask(int i) {
            Scanner in = new Scanner(System.in);
            String s;
            switch (i) {
                case 1,2: {
                    do {
                        System.out.println("1 - Ввод через консоль" + "\n" + "2 - Ввод через файл" + "0 - назад" + "Enter - выйти из программы");
                        s = in.nextLine();
                        try {
                            chooseInput(Integer.parseInt(s), i);
                        } catch (Exception NumberFormatException) {break; }
                    }while (s!="1" || s!="2");}

                default: System.out.println("Вы ввели неизвистный символ...Введите 1, 2 или 'Enter' " +
                        "соответсвенно действую,которое вы хотите выполнить");

            }

        }

        public static void chooseInput(int s, int i){
            File File = new File();
            if(i==1){
                if(s==1) task1();
                else if (s==2)File.writer();
                else {System.out.println("Вы ввели неизвистный символ...Введите 1, 2 или 'Enter' " +
                        "соответсвенно действую,которое вы хотите выполнить");
                    chooseTask(i);}
            }
            else if (i==2) {
                if (s==1) task2();
                else if(s==2) File.writer();
                else{System.out.println("Вы ввели неизвистный символ...Введите 1, 2 или 'Enter' " +
                        "соответсвенно действую,которое вы хотите выполнить");
                    chooseTask(i);}

            }
        }

        public static void task1(){
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

        public static void task2(){                         //Задание № 2 и 3
            Scanner in = new Scanner(System.in);
            System.out.println("Введите строку:");
            String str= in.nextLine();                     //Ввод строки
            //Second stroka1 = new Second();                //Конструктор по умолчанию
            Second stroka = new Second(str);               //Конструктор с параметром
            //Second stroka2 = new Second(stroka);         //Конструктор копирования
        }
    }
}
*/