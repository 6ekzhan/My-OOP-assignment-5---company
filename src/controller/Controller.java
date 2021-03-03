package controller;

import repositories.IRepository;
import entities.FullStackDeveloper.FullStackDeveloper;
import entities.GameDeveloper.GameDeveloper;

import java.time.LocalDate;


public class Controller {
    private final IRepository iRepository;

    public Controller(IRepository iMedRepository) {
        this.iRepository = iMedRepository;
    }

    public String SearchEmployeeByID(int id){
        String result = iRepository.SearchEmployeeByID(id).toString();
        return result;
    }

    public String RemoveEmployeeByID(int id){
        boolean result = iRepository.RemoveEmployeeByID(id);
        if(result){
            return "Employee was removed";
        }else{
            return "Error";
        }
    }

    public String SearchEmployeeByName(String name){
        String result = iRepository.SearchEmployeeByName(name).toString();
        return result;
    }

    public String AddGame(String name, String surname, int age, String address, LocalDate start_date,  int salary, String e_mail){
        boolean result = iRepository.AddGame(new GameDeveloper(name, surname, age, address,start_date, salary, e_mail));
        if(result){
            return "Employee was added";
        }else{
            return "Error";
        }
    }

    public String SearchCheapestSalaryGame(){
        String result = iRepository.SearchCheapestSalaryGame().toString();
        return result;
    }

    public String ShowAllGame(){
        String result = iRepository.ShowAllGame().toString();
        return  result;
    }

    public String AddFullStack(String name, String surname, int age, String address, LocalDate start_date,  int salary, String e_mail){
        boolean result = iRepository.AddFullStack(new FullStackDeveloper(name, surname, age, address,start_date, salary, e_mail));
        if(result){
            return "Employee was added";
        }else{
            return "Error";
        }
    }

    public String SearchExpensiveSalaryFullStack(){
        String result = iRepository.SearchExpensiveSalary().toString();
        return result;
    }

    public String ShowAllFullStack(){
        String result = iRepository.ShowAllFullStack().toString();
        return  result;
    }
}