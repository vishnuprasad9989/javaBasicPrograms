package StreamApis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String name;
    private double salary;
    private String address;

    public Employee(){
        System.out.println("This is default constructor");
    }
    public Employee(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +  ", name='" + name + '\'' +
                ", salary=" + salary + ", address='" + address + '\'' + '}';
    }

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"vishnu",64000,"wakad"));
        list.add(new Employee(103,"aangad",60000,"shivane"));
        list.add(new Employee(106,"krishna",61000,"moushi"));
        list.add(new Employee(102,"roman",120000,"california"));
        list.add(new Employee(104,"cena",380000,"new york"));
        list.add(new Employee(105,"manish",71000,"mumbai"));

        Map<Integer , Double> map1 = list.stream()
                .collect(Collectors.toMap(id11 ->id11.getId(), id22 -> id22.getSalary()));
        System.out.println(map1);

        // take input key as id and value as Employee Object

        Map<Integer , Employee> map2 = list.stream()
                .collect(Collectors.toMap(id11 -> id11.getId(), emp1 -> emp1));
        System.out.println(map2);
    }
}

