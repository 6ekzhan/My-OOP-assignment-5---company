package entities.GameDeveloper;

import entities.superclass.Employee;

import java.time.LocalDate;

public class GameDeveloper extends Employee{
    public GameDeveloper() {
    }

    public GameDeveloper(int id, String name, String surname, int age, String address, LocalDate start_date, int salary, String e_mail, String department) { // constructer of the class
        super(id, name, surname, age, address, start_date, salary, e_mail, department);
    }

    public GameDeveloper(String name, String surname, int age, String address, LocalDate start_date, int salary, String e_mail, String department) { // constructer of the class
        super(name, surname, age, address, start_date, salary, e_mail, department);
    }

    public GameDeveloper(String name, String surname, int age, String address, LocalDate start_date, int salary, String e_mail) { // constructer of the class
        super(name, surname, age, address, start_date, salary, e_mail);
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setSurname(String surname) {
        super.setSurname(surname);
    }

    @Override
    public String getSurname() {
        return super.getSurname();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setAddress(String address) {
        super.setAddress(address);
    }

    @Override
    public String getAddress() {
        return super.getAddress();
    }

    @Override
    public void setStart_date(LocalDate start_date) {
        super.setStart_date(start_date);
    }

    @Override
    public LocalDate getStart_date() {
        return super.getStart_date();
    }

    @Override
    public void setSalary(int salary) {
        super.setSalary(salary);
    }

    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public void setE_mail(String e_mail) {
        super.setE_mail(e_mail);
    }

    @Override
    public String getE_mail() {
        return super.getE_mail();
    }

    @Override
    public void setDepartment(String department) {
        super.setDepartment(department);
    }

    @Override
    public String getDepartment() {
        return super.getDepartment();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}