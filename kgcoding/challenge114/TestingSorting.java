package in.kgcoding.challenge114;

import java.util.List;

public class TestingSorting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Prashant",500),
                new Employee("Seema",5000),
                new Employee("Sita",100000),
                new Employee("Gita",100),
                new Employee("Rita",10),
                new Employee("Nita",50000)
        );

        employees.stream()
                .sorted((emp1, emp2) -> emp1.getSalary()  - emp2.getSalary())
                .forEach(System.out::println);
    }
}
