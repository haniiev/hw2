
  package com.company;

public class Employee {
private String name;
private int rate;
private int hours;
public int count = 0;


    public  Employee (){
        count++;
    }

     public  Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        count++;
     }

     public Employee(String name, int rate, int hours) {
     this.name = name;
     this.rate = rate;
     this.hours = hours;
     count++;
     }

    public static int getSalary() {
        return rate * hours;
    }

    public  static  int getBonuses() {
        return  getSalary() / 10;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public static int getHours() {
        return hours;
    }

    public static void setHours(int hours) {
        Employee.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

}
