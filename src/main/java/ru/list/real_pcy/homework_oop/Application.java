package ru.list.real_pcy.homework_oop;

public class Application {

    public static void main(String[] args) {
        //Alex
        Person alex = new Person();
        alex.setName("Alex");
        alex.setAge(78);
//        alex.setSalary();
        alex.setCompanyName("Nivea");
        System.out.println(alex.getCompanyName());

//        alex.salaryValidate();

        //Bob
        Person bob = new Person();
        bob.setName("Bob");
        bob.setAge(23);
        bob.setSalary(23000.50);
        System.out.println(bob.getCompanyName());

        //Company
        Company company = new Company();
//        company.addPersonToWork("Oz");
//        company.addPersonToWork("Nick");
//        company.addPersonToWork("Cole");
//        company.print();

//        company.firePerson();
//        company.hirePerson(alex);
        company.setArrayWorkers(new Person[0]);
        company.setName("TwinkoOff");
        company.addNewWorker(bob);
        company.addNewWorker(alex);
        company.printAllWorkers();
        System.out.println(alex.getCompanyName());

        company.deleteWorker(bob);
        company.printAllWorkers();
    }
}
