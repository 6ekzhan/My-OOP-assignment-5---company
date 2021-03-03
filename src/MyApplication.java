import controller.Controller;

import java.util.Scanner;
import java.time.LocalDate;

public class MyApplication {
    private final Controller controller;
    private final Scanner scanner;

    public MyApplication(Controller Controller) {
        this.controller = Controller;
        scanner = new Scanner(System.in);
    }

    public void start(){
        while(true){
            System.out.println("Choose one option:\n " +
                    "a) Press 1 to search employee by id\n " +
                    "b) Press 2 to remove employee by id\n " +
                    "c) Press 3 to search employee by name\n " +
                    "d) Press 4 to add employee in Game development\n " +
                    "e) Press 5 to search cheapest in Game development\n " +
                    "f) Press 6 to show all employees from Game development\n " +
                    "g) Press 7 to add employee in Full-stack development\n " +
                    "h) Press 8 to search expensive in Full-stack development\n " +
                    "h) Press 9 to show all employees from Full-stack development\n " +
                    "i) Press 0 to exit\n");
            int choice = scanner.nextInt();
            if(choice==1){
                SearchEmployeeByIDMenu();
            }
            if(choice==2){
                RemoveEmployeeByIDMenu();
            }
            if(choice==3){
                SearchEmployeeByNameMenu();
            }
            if(choice==4){
                AddGameMenu();
            }
            if(choice==5){
                SearchCheapestSalaryGameMenu();
            }
            if(choice==6){
                ShowAllGameMenu();
            }
            if(choice==7){
                AddFullStackMenu();
            }
            if(choice==8){
                SearchExpensiveSalaryFullStack();
            }
            if(choice==9){
                ShowAllFullStack();
            }
            if(choice==0){
                break;
            }

            System.out.println("*********************");
        }
    }

    public void SearchEmployeeByIDMenu(){
        System.out.println("Write the id of employee:");
        int id = scanner.nextInt();
        System.out.println(controller.SearchEmployeeByID(id));
    }

    public void RemoveEmployeeByIDMenu(){
        System.out.println("Write the employee's ID:");
        int id = scanner.nextInt();
        System.out.println(controller.RemoveEmployeeByID(id));
    }

    public void SearchEmployeeByNameMenu(){
        System.out.println("Write the name of employee:");
        String name = scanner.next();
        System.out.println(controller.SearchEmployeeByName(name));
    }

    public void AddGameMenu(){
        System.out.println("Write the employee's name:");
        String name = scanner.next();
        System.out.println("Write the employee's surname:");
        String surname = scanner.next();
        System.out.println("Write the employee's age:");
        int age = scanner.nextInt();
        System.out.println("Write the employee's address:");
        String address = scanner.next();
        System.out.println("Write the start date of employee(format of date must to be yyyy-mm-dd):");
        String date = scanner.next();
        LocalDate start_date = LocalDate.parse(date);
        System.out.println("Write the salary:");
        int salary = scanner.nextInt();
        System.out.println("Write the employee's e-mail:");
        String e_mail = scanner.next();
        System.out.println(controller.AddGame(name, surname, age, address, start_date, salary, e_mail));
    }

    public void SearchCheapestSalaryGameMenu(){
        System.out.println(controller.SearchCheapestSalaryGame());
    }

    public void ShowAllGameMenu(){
        System.out.println(controller.ShowAllGame());
    }

    public void AddFullStackMenu(){
        System.out.println("Write the employee's name:");
        String name = scanner.next();
        System.out.println("Write the employee's surname:");
        String surname = scanner.next();
        System.out.println("Write the employee's age:");
        int age = scanner.nextInt();
        System.out.println("Write the employee's address:");
        String address = scanner.next();
        System.out.println("Write the start date of employee:");
        String date = scanner.next();
        LocalDate start_date = LocalDate.parse(date);
        System.out.println("Write the salary:");
        int salary = scanner.nextInt();
        System.out.println("Write the employee's e-mail:");
        String e_mail = scanner.next();
        System.out.println(controller.AddFullStack(name, surname, age, address, start_date, salary, e_mail));
    }

    public void SearchExpensiveSalaryFullStack(){
        System.out.println(controller.SearchExpensiveSalaryFullStack());
    }

    public void ShowAllFullStack(){
        System.out.println(controller.ShowAllFullStack());
    }
}
