package repositories;

import data.IDBManager;
import entities.superclass.Employee;
import entities.GameDeveloper.GameDeveloper;
import entities.FullStackDeveloper.FullStackDeveloper;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Repository implements IRepository{
    private final IDBManager idbManager;

    public Repository(IDBManager idbManager) {
        this.idbManager = idbManager;
    }

    @Override
    public Employee SearchEmployeeByID(int id) {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee WHERE id =" + id); // sql statement to find the employee by ID
            ResultSet resultSet = preparedStatement.executeQuery();
            Employee employee = new Employee();
            if (resultSet.next()) {
                employee = new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getString("address"),
                        resultSet.getDate("start_date").toLocalDate(),
                        resultSet.getInt("salary"),
                        resultSet.getString("e_mail"),
                        resultSet.getString("department")
                );
            }
            return employee;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean RemoveEmployeeByID(int id) {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE * FROM employee where id = " + id); // sql statement to remove employee by ID
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<Employee> SearchEmployeeByName(String name) {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee where name LIKE '%" + name + "%'");// sql statement to find the employee by name
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<Employee> allDevelopers = new ArrayList<>();
            while (resultSet.next()) {
                Employee allDeveloper = new Employee(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getString("address"),
                        resultSet.getDate("start_date").toLocalDate(),
                        resultSet.getInt("salary"),
                        resultSet.getString("e_mail"),
                        resultSet.getString("department")
                );
                allDevelopers.add(allDeveloper);
            }
            return allDevelopers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean AddGame(GameDeveloper gameDeveloper) {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee(name, surname, age, address, start_date, salary, e_mail,department) VALUES (?,?,?,?,?,?,?,'GameDeveloper')"); // sql statement to add the employee in Game Development
            preparedStatement.setString(1, gameDeveloper.getName());
            preparedStatement.setString(2, gameDeveloper.getSurname());
            preparedStatement.setInt(3, gameDeveloper.getAge());
            preparedStatement.setString(4, gameDeveloper.getAddress());
            preparedStatement.setDate(5, Date.valueOf(gameDeveloper.getStart_date()));
            preparedStatement.setInt(6, gameDeveloper.getSalary());
            preparedStatement.setString(7, gameDeveloper.getE_mail());
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<GameDeveloper> SearchCheapestSalaryGame() {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee WHERE salary = (SELECT MIN(salary) FROM employee) AND department = 'GameDeveloper'"); // sql statement to find employee from Game Development with minimum salary
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<GameDeveloper> gameDevelopers = new ArrayList<>();
            while (resultSet.next()) {
                GameDeveloper gameDeveloper = new GameDeveloper(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getString("address"),
                        resultSet.getDate("start_date").toLocalDate(),
                        resultSet.getInt("salary"),
                        resultSet.getString("e_mail"),
                        resultSet.getString("department")
                );
                gameDevelopers.add(gameDeveloper);
            }
            return gameDevelopers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<GameDeveloper> ShowAllGame() {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee where department = 'GameDeveloper'"); // sql statement to show all employees that work in Game Development
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<GameDeveloper> gameDevelopers = new ArrayList<>();
            while (resultSet.next()) {
                GameDeveloper gameDeveloper = new GameDeveloper(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getString("address"),
                        resultSet.getDate("start_date").toLocalDate(),
                        resultSet.getInt("salary"),
                        resultSet.getString("e_mail"),
                        resultSet.getString("department")
                );
                gameDevelopers.add(gameDeveloper);
            }
            return gameDevelopers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean AddFullStack(FullStackDeveloper fullStackDeveloper) {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO employee(name, surname, age, address, start_date, salary, e_mail, department) VALUES (?,?,?,?,?,?,?,'FullStackDeveloper')"); // sql statement to add  the employee in Full-stack Development
            preparedStatement.setString(1, fullStackDeveloper.getName());
            preparedStatement.setString(2, fullStackDeveloper.getSurname());
            preparedStatement.setInt(3, fullStackDeveloper.getAge());
            preparedStatement.setString(4, fullStackDeveloper.getAddress());
            preparedStatement.setDate(5, Date.valueOf(fullStackDeveloper.getStart_date()));
            preparedStatement.setInt(6, fullStackDeveloper.getSalary());
            preparedStatement.setString(7, fullStackDeveloper.getE_mail());
            preparedStatement.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public ArrayList<FullStackDeveloper> SearchExpensiveSalary() {
        Connection connection;
        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee WHERE salary = (SELECT MAX(salary) FROM employee) AND department = 'FullStackDeveloper'"); // sql statement to find employee from Full-stack Development with maximum salary
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<FullStackDeveloper> fullStackDevelopers = new ArrayList<>();
            while (resultSet.next()) {
                FullStackDeveloper fullStackDeveloper = new FullStackDeveloper(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getString("address"),
                        resultSet.getDate("start_date").toLocalDate(),
                        resultSet.getInt("salary"),
                        resultSet.getString("e_mail"),
                        resultSet.getString("department")
                );
                fullStackDevelopers.add(fullStackDeveloper);
            }
            return fullStackDevelopers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public ArrayList<FullStackDeveloper> ShowAllFullStack() {
        Connection connection;

        try {
            connection = idbManager.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM employee where department = 'FullStackDeveloper'"); // sql statement to show all employees that work in Full-stack Development
            ResultSet resultSet = preparedStatement.executeQuery();
            ArrayList<FullStackDeveloper> fullStackDevelopers = new ArrayList<>();
            while (resultSet.next()) {
                FullStackDeveloper fullStackDeveloper = new FullStackDeveloper(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getInt("age"),
                        resultSet.getString("address"),
                        resultSet.getDate("start_date").toLocalDate(),
                        resultSet.getInt("salary"),
                        resultSet.getString("e_mail"),
                        resultSet.getString("department")
                );
                fullStackDevelopers.add(fullStackDeveloper);
            }
            return fullStackDevelopers;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
