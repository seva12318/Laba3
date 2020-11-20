package com.company;

public class Birds extends Animals {

    Birds(){
        super();
    }

    @Override
    public void setNameAnimal(String name) { super.name=name+" (Птица)"; }

    @Override
    public void setKindOfAnimal(String kind) { super.kindOfAnimal=kind; }

    @Override
    public void setAge(int age) { super.age=age; }

    @Override
    public void setTail(boolean tail) { super.tail=tail; }

    @Override
    public String getNameAnimal() { return super.name; }

    @Override
    public String getKindOfAnimal() { return super.kindOfAnimal; }

    @Override
    public int getAge() { return super.age; }

    @Override
    public boolean getTail() { return super.tail; }
}
