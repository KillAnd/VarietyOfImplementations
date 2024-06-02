import java.util.*;

import static sun.util.locale.LocaleUtils.isEmpty;

public class EmployeeBook implements EmployeeService {

    private static final Map<Integer, Employee> employees = new HashMap<>(Map.of(
            1, new Employee("Логинов", "Виталий", "Юрьевич", 2, 267000),
            2, new Employee("Маркова", "Антонина", "Витальевна", 2, 246000),
            3, new Employee("Пономарев", "Илья", "Игоревич", 2, 250000),
            4, new Employee("Иванов", "Константин", "Валерьевич", 2, 270000),
            5, new Employee("Петров", "Иван", "Сергеевич", 3, 220000),
            6, new Employee("Сидоров", "Андрей", "Ильич", 3, 258000),
            7, new Employee("Гавриков", "Никита", "Андреевич", 3, 213000),
            8, new Employee("Мамонтов", "Анатолий", "Георгиевич", 5, 289000),
            9, new Employee("Селезнева", "Анна", "Григорьевна", 5, 245000),
            10, new Employee("Юрченко", "Александр", "Потапович", 5, 265000)
    ));

    @Override
    public void addEmployee(int serviceNumber, Employee employee) {
        if (employees.containsKey(serviceNumber)) {
            throw new RuntimeException("Сотрудник уже присутствует в базе");
        } else {
            employees.put(serviceNumber, employee);
        }
    }

    @Override
    public void deleteEmployee(int serviceNumber) {
        try {
            if (serviceNumber >= 0 & serviceNumber <= employees.size()) {
                employees.remove(serviceNumber);
            } else {
                throw new RuntimeException("указан не существующий ID сотрудника");
            }
        } catch (RuntimeException e) {
            System.out.println("указан не существующий ID сотрудника");
        }
        }


    @Override
    public void findEmployee(int serviceNumber) {
        System.out.println(employees.get(serviceNumber));
    }
@Override
    public void fullListEmployee() {
        System.out.println(employees);
    }
}

