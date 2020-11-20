package com.company;


import java.util.ArrayList;
import java.util.Scanner;

public class Performance {
    static ArrayList<Mammals> mammals = null;
    static ArrayList<Birds> fly = null;
    static ArrayList<Artiodactyl> artid = null;

    public Performance() {
        mammals = new ArrayList<>();
        fly = new ArrayList<>();
        artid = new ArrayList<>();
    }


    public Performance(int k) {
        switch (k) {
            case 0:
                System.exit(0);
            case 1: {
                addArtiodactyl();
                break;
            }
            case 2: {
                addBird();
                break;
            }
            case 3: {
                addMammals();
                break;
            }
            default:
                System.err.println("Вы ввели цирфу, которая не " +
                        "предложена для выбор, повторите попытку");
        }
    }

    private void addArtiodactyl() {
        System.out.println("Добавление Парнокопытного");
        Artiodactyl Arti = new Artiodactyl();

        Scanner in = new Scanner(System.in);

        System.out.println("1) Введите вид Парнокопытного: ");
        Arti.setKindOfAnimal(in.nextLine());

        System.out.println("2) Введите возраст этого Парнокопытного: ");
        Arti.setAge(Integer.parseInt(in.nextLine()));

        System.out.println("3) Введите имя этой Парнокопытного: ");
        String s = in.nextLine();
        Arti.setNameAnimal(s);

        System.out.println("4) Есть ли у " + s + " хвост?: \n" +
                "0 - Да \n" +
                "1 - Нет");
        Arti.setTail(Boolean.parseBoolean(in.nextLine()));
        artid.add(Arti);
        System.out.println("Парнокопытное добавлено!");
    }

    private void addBird() {
        System.out.println("Добавление Птицы");
        Birds Birds = new Birds();

        Scanner in = new Scanner(System.in);

        System.out.println("1) Введите вид Птицы: ");
        Birds.setKindOfAnimal(in.nextLine());

        System.out.println("2) Введите возраст этой Птицы: ");
        Birds.setAge(Integer.parseInt(in.nextLine()));

        System.out.println("3) Введите имя этой Птицы: ");
        String s = in.nextLine();
        Birds.setNameAnimal(s);

        System.out.println("4) Есть ли у " + s + " хвост?: \n" +
                "0 - Да \n" +
                "1 - Нет");
        Birds.setTail(Boolean.parseBoolean(in.nextLine()));
        fly.add(Birds);
        System.out.println("Птица добавлена!");
    }

    private void addMammals() {
        System.out.println("Добавление Млекопитающего");
        Mammals Mam = new Mammals();

        Scanner in = new Scanner(System.in);

        System.out.println("1) Введите вид Млекопитающего: ");
        Mam.setKindOfAnimal(in.nextLine());

        System.out.println("2) Введите возраст этого Млекопитающего: ");
        Mam.setAge(Integer.parseInt(in.nextLine()));

        System.out.println("3) Введите имя этого Млекопитающего: ");
        String s = in.nextLine();
        Mam.setNameAnimal(s);

        System.out.println("4) Есть ли у " + s + " хвост?: \n" +
                "0 - Да \n" +
                "1 - Нет");
        Mam.setTail(Boolean.parseBoolean(in.nextLine()));
        mammals.add(Mam);
        System.out.println("Млекопитающее добавлено!");
    }

    public void showAllAnimals(int tuc) {
        System.out.println(" СПИСОК ЖИВОТНЫХ: ");
        if (fly.size() == 0 && artid.size() == 0 && mammals.size() == 0)
            System.out.println("Список пуст\n");
        else {
            if (tuc == 1 || tuc == 0) {
                System.out.println("        ПТИЦЫ");
                if (fly.size() == 0) {
                    System.out.println("В списке нет птиц");
                } else {
                    for (int i = 0; i < fly.size(); i++) {
                        System.out.println(i + ".  Вид птицы: " + fly.get(i).getKindOfAnimal());
                        System.out.println("    Возраст птицы: " + fly.get(i).getAge());
                        System.out.println("    Имя птиц: " + fly.get(i).getNameAnimal());
                        System.out.print("    Наличие хвоста: ");
                        if (fly.get(i).getTail())
                            System.out.println(" + ");
                        else System.out.println(" - \n");
                    }
                }
            }
            if (tuc == 1 || tuc == 3) {
                System.out.println("        МЛЕКОПИТАЮЩИЕ");
                if (mammals.size() == 0) {
                    System.out.println("В списке нет млекопитающих");
                } else {
                    for (int i = 0; i < mammals.size(); i++) {
                        System.out.println(i + ".  Вид: " + mammals.get(i).getKindOfAnimal());
                        System.out.println("    Возраст: " + mammals.get(i).getAge());
                        System.out.println("    Имя: " + mammals.get(i).getNameAnimal());
                        System.out.print("    Наличие хвоста: ");
                        if (mammals.get(i).getTail())
                            System.out.print(" - ");
                        else System.out.print(" + \n");
                    }
                }
            }
            if (tuc == 1 || tuc == 2) {
                System.out.println("\n        ПАРНОКОПЫТНЫЕ");
                if (artid.size() == 0) {
                    System.out.println("В списке нет парнокопытных");
                } else {
                    for (int i = 0; i < artid.size(); i++) {
                        System.out.println(i + ".  Вид: " + artid.get(i).getKindOfAnimal());
                        System.out.println("    Возраст: " + artid.get(i).getAge());
                        System.out.println("    Имя: " + artid.get(i).getNameAnimal());
                        System.out.print("    Наличие хвоста: ");
                        if (artid.get(i).getTail())
                            System.out.print(" - ");
                        else System.out.print(" + \n");
                    }
                }
            }
        }
    }

    public void deleteAnimal() {
        Scanner in = new Scanner(System.in);
        System.out.println("    УДАЛЕНИЕ ЖИВОТНОГО ИЗ СПИСКА");
        System.out.println("В каком разделе находится животное?\n" +
                "1 - Парнокопытные\n" +
                "2 - Птицы\n" +
                "3 - Млекопитающие");
        int k = Integer.parseInt(in.nextLine());
        System.out.println("Выберите порядковый номер этого животного");
        switch (k) {
            case 1: {
                showAllAnimals(2);
                artid.remove(Integer.parseInt(in.next()));
                break;
            }
            case 2: {
                showAllAnimals(0);
                fly.remove(Integer.parseInt(in.next()));
                break;
            }
            case 3: {
                showAllAnimals(3);
                mammals.remove(Integer.parseInt(in.next()));
                break;
            }
        }

    }

    public void clearLists() {
        mammals.clear();
        fly.clear();
        artid.clear();
    }

    public void findNameOfAnimal() {
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя животного");
        String name = in.nextLine();
        for (int i = 0; i < fly.size(); i++) {
            if (fly.get(i).getNameAnimal().contains(name)) {
                System.out.println(i + ".  Вид птицы: " + fly.get(i).getKindOfAnimal());
                System.out.println("    Возраст птицы: " + fly.get(i).getAge());
                System.out.println("    Имя птиц: " + fly.get(i).getNameAnimal());
                System.out.print("    Наличие хвоста: ");
                if (fly.get(i).getTail())
                    System.out.print(" - ");
                else System.out.print(" + ");
                count++;
            }
        }

        for (int i = 0; i < artid.size(); i++) {
            if (artid.get(i).getNameAnimal().contains(name)) {
                System.out.println(i + ".  Вид птицы: " + artid.get(i).getKindOfAnimal());
                System.out.println("    Возраст птицы: " + artid.get(i).getAge());
                System.out.println("    Имя птиц: " + artid.get(i).getNameAnimal());
                System.out.print("    Наличие хвоста: ");
                if (artid.get(i).getTail())
                    System.out.print(" - ");
                else System.out.print(" + ");
                count++;
            }
        }
        for (int i = 0; i < mammals.size(); i++) {
            if (mammals.get(i).getNameAnimal().contains(name)) {
                System.out.println(i + ".  Вид птицы: " + mammals.get(i).getKindOfAnimal());
                System.out.println("    Возраст птицы: " + mammals.get(i).getAge());
                System.out.println("    Имя птиц: " + mammals.get(i).getNameAnimal());
                System.out.print("    Наличие хвоста: ");
                if (mammals.get(i).getTail())
                    System.out.print(" - ");
                else System.out.print(" + ");
                count++;
            }
        }

        if(count==0)
            System.out.println("Животных с таким именем не найдено");
    }
}