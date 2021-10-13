package ru.list.real_pcy.homework_oop;

import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        //Alex
        Person alex = new Person();
        Company company = new Company();

        alex.setName("Alex");
        alex.setAge(78);
//        alex.setSalary();
        alex.setCompanyName("Nivea");
        System.out.println(alex.getCompanyName());

        alex.salaryValidate();

        //Bob
        Person bob = new Person();
        bob.setName("Bob");
        bob.setAge(23);
        bob.setSalary(23000.50);
        System.out.println(bob.getCompanyName());

        //Company
        company.addPersonToWork("Oz");
        company.addPersonToWork("Nick");
        company.addPersonToWork("Cole");
        company.print();
    }
}