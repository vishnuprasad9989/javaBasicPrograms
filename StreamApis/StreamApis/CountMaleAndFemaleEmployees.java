package StreamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountMaleAndFemaleEmployees {
    private int id;
    private String name;
    private String gender;
    private float salary;

    public CountMaleAndFemaleEmployees() {

    }

    public CountMaleAndFemaleEmployees(int id, String name, String gender, float salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        List<CountMaleAndFemaleEmployees> list = Arrays.asList(
                new CountMaleAndFemaleEmployees(101, "vishnu", "male", 95000),
                new CountMaleAndFemaleEmployees(102, "roman", "male", 38200),
                new CountMaleAndFemaleEmployees(103, "priyanka", "female", 18000),
                new CountMaleAndFemaleEmployees(104, "aishwarya", "female", 45000),
                new CountMaleAndFemaleEmployees(105, "aarthi", "female", 28000),
                (new CountMaleAndFemaleEmployees(106, "mahira", "female", 21000)),
                (new CountMaleAndFemaleEmployees(107, "pavan", "male", 97000)),
                (new CountMaleAndFemaleEmployees(108, "anusha", "female", 19500)),
                (new CountMaleAndFemaleEmployees(109, "vaishnavi", "female", 58000))
        );

        // using stream sort number of male and females
        long femaleCount = list.stream().filter(emp -> "female".equals(emp.getGender())).count();
        long maleCount = list.stream().filter(emp1 -> "male".equals(emp1.getGender())).count();

        System.out.println("Number of females are :  " + femaleCount + " are present in the organisation");
        System.out.println("Number of males are :  " + maleCount + " are present in the organisation");

    }
}
