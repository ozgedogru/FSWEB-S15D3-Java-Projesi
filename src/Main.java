import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();

        employees.add(new Employee(1, "Ayse", "Yilmaz"));
        employees.add(new Employee(2, "Kerem", "Kaya"));
        employees.add(new Employee(3, "Beren", "Demir"));
        employees.add(new Employee(2, "Kerem", "Kaya"));
        employees.add(new Employee(5, "Batuhan", "Ozturk"));
        employees.add(new Employee(1, "Ayse", "Yilmaz"));

        LinkedList<Employee> duplicates = new LinkedList<>();
        Map<Integer, Employee> uniqueOnes = new HashMap<>();

        for(Employee employee : employees) {
            if(uniqueOnes.containsKey(employee.id)) {
                duplicates.add(employee);
            } else {
                uniqueOnes.put(employee.id, employee);
            }
        }

        employees.removeAll(duplicates);

        System.out.println("Unique employees: ");
        for(Employee employee : uniqueOnes.values()) {
            System.out.println(employee.firstname + " " + employee.lastname);
        }

        System.out.println("Duplicate employees: ");
        for(Employee duplicate : duplicates) {
            System.out.println(duplicate.firstname + " " + duplicate.lastname);
        }
    }

}