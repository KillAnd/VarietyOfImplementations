public class Main {
    public static void main(String[] args) {

        EmployeeBook employeeBook = new EmployeeBook();
        employeeBook.deleteEmployee(4);
        employeeBook.fullListEmployee();
        employeeBook.addEmployee(4, new Employee("Следов", "Виктор", "Геннадьевич", 2, 324555));
        employeeBook.fullListEmployee();
        employeeBook.findEmployee(5);



    }
}