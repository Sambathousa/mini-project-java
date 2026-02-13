package db;

import model.entities.Employee;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDb {
    private final List <Employee> employeeList;
    public EmployeeDb(){
        employeeList = new ArrayList<>(){{
            add(new Employee(
                    "Ady ban",10000.00, LocalDate.now()
            ));
            add(new Employee(
                    "Kakney",15000.00, LocalDate.now().minusDays(7)
            ));
            add(new Employee(
                    "Sna sna",15000.00, LocalDate.now().minusMonths(2)
            ));
            add(new Employee(
                    "messi",24000.00, LocalDate.now()
            ));
            add(new Employee(
                    "penaldo",1500.00, LocalDate.now().minusDays(7)
            ));
            add(new Employee(
                    "goat",1400.00, LocalDate.now().minusMonths(2)
            ));
            add(new Employee(
                    "Supersliz",200.00, LocalDate.now().minusDays(7)
            ));
            add(new Employee(
                    "jota",1400.00, LocalDate.now().minusMonths(2)
            ));
        }};
    }



    public List<Employee> getEmployeeList(){
        return employeeList;
    }
}
