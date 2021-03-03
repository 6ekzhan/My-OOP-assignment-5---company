package entities.superclass;

import java.time.LocalDate;

public class Employee {
    public int id;
    public String name;
    public String surname;
    public int age;
    public String address;
    public LocalDate start_date;
    public int salary;
    public String e_mail;
    public String department;

    public Employee() {
    }

    public Employee(int id, String name, String surname, int age, String address, LocalDate start_date, int salary, String e_mail, String department) { // constructer of the class
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.start_date = start_date;
        this.salary = salary;
        this.e_mail = e_mail;
        this.department = department;
    }

    public Employee(String name, String surname, int age, String address, LocalDate start_date, int salary, String e_mail, String department) { // constructer of the class
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.start_date = start_date;
        this.salary = salary;
        this.e_mail = e_mail;
        this.department = department;
    }

    public Employee(String name, String surname, int age, String address, LocalDate start_date, int salary, String e_mail) { // constructer of the class
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
        this.start_date = start_date;
        this.salary = salary;
        this.e_mail = e_mail;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getStart_date() {
        return start_date;
    }

    public void setStart_date(LocalDate start_date) {
        this.start_date = start_date;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", start_date=" + start_date +
                ", salary=" + salary +
                ", e_mail='" + e_mail + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}