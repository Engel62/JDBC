
import dao.CityDAO;
import dao.CityDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import models.City;
import models.Employee;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

        Employee employee1 = new Employee("Алексей", "Петров", "male", 24, new City("Дубровичи"));
        employeeDAO.create(employee1);

        System.out.println(employeeDAO.readById(2));

        List<Employee> employeeList = employeeDAO.readAll();
        employeeList.forEach(System.out::println);

        Employee employee2 = new Employee(9, "Виталий", "Васекин", "male", 35, new City("Тверь"));
        employeeDAO.updateEmployee(employee2);

        employeeDAO.deleteEmployee(employee2);

        City city1 = new City("Курган");
        cityDAO.create(city1);


        System.out.println(cityDAO.readById(1));

        List<City> cityList = cityDAO.readAll();
        cityList.forEach(System.out::println);

        City city2 = new City("Подольск");
        cityDAO.updateCity(city2);

        cityDAO.deleteCity(city2);
    }
}