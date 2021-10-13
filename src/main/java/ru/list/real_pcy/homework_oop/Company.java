package ru.list.real_pcy.homework_oop;

import java.util.ArrayList;

public class Company {
    //Коллекции
    ArrayList<String> arrayList = new ArrayList<>();
    public void addPersonToWork(String name) {
        arrayList.add(name);
    }
    public void print() {
        //iter
        for (String s : arrayList) {
            System.out.println(s);
//        System.out.println(arrayList);
        }
    }
}
