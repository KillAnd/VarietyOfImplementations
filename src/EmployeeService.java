import java.util.Map;

public interface EmployeeService {

    void addEmployee(int serviceNumber, Employee employee);

    void deleteEmployee(int serviceNumber);

    void findEmployee(int serviceNumber);

    void fullListEmployee();
}
