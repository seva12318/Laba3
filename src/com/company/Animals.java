package com.company;

public abstract class Animals {
    protected String name;
    protected String kindOfAnimal;
    protected int age;
    protected boolean tail;

    public Animals(){
        name = "";
        kindOfAnimal="";
        age = -1;
        tail = false;
    }

    public abstract void setNameAnimal(String name);
    public abstract void setKindOfAnimal(String kind);
    public abstract void setAge(int age);
    public abstract void setTail(boolean tail);

    public abstract String getNameAnimal();
    public abstract String getKindOfAnimal();
    public abstract int getAge();
    public abstract boolean getTail();


}
