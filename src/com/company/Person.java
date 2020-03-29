package com.company;

import java.util.Scanner;

public class Person {
    private String firstName;
    private  String lastName;
    private int birthYear;
    public static int count = 0;

    public Person(){
        count++;
    }

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        count++;
    }

    public Person(String firstName, String lastName, int birthYear){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        count++;
    }

    static Person input() {
        Scanner scan = new Scanner(System.in);
        Person p = new Person();
        System.out.print("First name: ");
        p.setFirstName(scan.next());
        System.out.print("Last name: ");
        p.setLastName(scan.next());
        System.out.print("Birth year: ");
        p.setBirthYear(scan.nextInt());
        return p;
    }

    void changeName(String fn, String ln){
        firstName = fn;
        lastName = ln;
    }

    public String output() {     // toString  !!!
        return "Person{FirstName: " + firstName + ", LastName: " + lastName + ", BirthYear: " + birthYear +
                ", Age: " + getAge();
    }

    public int getAge(){
        return 2020 - birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

}
