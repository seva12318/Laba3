package com.company;

import java.util.Scanner;

public class Menu {
    public Menu(){
        Performance Action = new Performance();
        Scanner in = new Scanner(System.in);
        while(true){
            int k;
            System.out.println("        Главное Меню:\n" +
                    "1 - Добавить животное\n" +
                    "2 - Вывести список животных\n" +
                    "3 - Найти животных по именам\n" +
                    "4 - Удалить животное\n"+
                    "5 - Очистить список животых полностью\n"+
                    "0 - Выход из программы\n" );

           // try {
            k = Integer.parseInt(in.nextLine());
            switch (k){
                case 0: System.exit(0);
                case 1: {chooseTypeOfAnimal(); break;}
                case 2: {Action.showAllAnimals(1); break;}
                case 3: {Action.findNameOfAnimal(); break;}
                case 4: {Action.deleteAnimal(); break;}
                case 5: {Action.clearLists(); break;}
                default: System.err.println("Вы ввели цирфу, которая не " +
                        "предложена для выбор, повторите попытку");
            }}
            //catch(Exception NumberFormatException){
            //System.err.println("Введены некорректные данные, попробуйте ещё раз");
            //}
        }

    private static void chooseTypeOfAnimal(){
        Scanner in = new Scanner(System.in);
        System.out.println("        Выбор вида животного:\n" +
                "1 - Парнокопытное\n" +
                "2 - Птица\n" +
                "3 - Млекопитающее\n" +
                "9 - Вернуться назад\n" +
                "0 - Вытий из программы");
        //try {
            int k=Integer.parseInt(in.nextLine());
            if(k!=9){ Performance text = new Performance(k);}
        //}
        //catch (Exception NumberFormatException){
           // System.err.println("Введены некорректные данные, попробуйте ещё раз");
        //}
    }


}
