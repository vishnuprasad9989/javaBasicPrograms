package StreamApis;

import java.util.Arrays;
import java.util.List;

public class Department {
    private String name;
    private String branch;
    private String department;

    public Department(String name, String branch, String department) {
        this.name = name;
        this.branch = branch;
        this.department = department;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Department{" + "name='" + name + '\'' + ", branch='" + branch + '\'' +
                ", department='" + department + '\'' + '}';
    }

    public static void main(String[] args) {
        List<Department> list = Arrays.asList(
                new Department("vishnu","pune","sde engineer"),
                new Department("suraj","pune","sde engineer"),
                new Department("angad","pune","marketing"),
                new Department("krishna","hyderabad","sde engineer"),
                new Department("naresh","hyderabad","marketing"),
                new Department("samir","pune","human resources") );

       // list.stream().map(Department::getDepartment).forEach(System.out::println);

        //using lamda expression
        list.stream().map(dep1 ->dep1.getDepartment()).forEach(dep111 -> System.out.println(dep111));
    }
}
