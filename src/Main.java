import controller.Controller;
import data.DBManager;
import data.IDBManager;
import repositories.IRepository;
import repositories.Repository;

public class Main {
    public static void main(String[] args) {
        IDBManager iManager = new DBManager();
        IRepository iMedRepository = new Repository(iManager);
        Controller controller = new Controller(iMedRepository);
        MyApplication myApplication = new MyApplication(controller);
        myApplication.start();
    }
}