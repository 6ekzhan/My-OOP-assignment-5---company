package repositories;

import entities.superclass.Employee;
import entities.GameDeveloper.GameDeveloper;
import entities.FullStackDeveloper.FullStackDeveloper;

import java.util.ArrayList;

public interface IRepository {
    public Employee SearchEmployeeByID(int id);
    public boolean RemoveEmployeeByID(int id);
    public ArrayList<Employee> SearchEmployeeByName(String name);
    public boolean AddGame(GameDeveloper gameDeveloper);
    public ArrayList<GameDeveloper> SearchCheapestSalaryGame();
    public ArrayList<GameDeveloper> ShowAllGame();
    public boolean AddFullStack(FullStackDeveloper fullStackDeveloper);
    public ArrayList<FullStackDeveloper> SearchExpensiveSalary();
    public ArrayList<FullStackDeveloper> ShowAllFullStack();
}