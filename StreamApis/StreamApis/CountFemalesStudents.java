package StreamApis;

import java.util.Arrays;
import java.util.List;

class Student {
    int stuId;
    String stuName;
    String stuGender;
    double stuFees;

    public Student(int stuId, String stuName, String stuGender, double stuFees) {
        this.stuId = stuId;
        this.stuName = stuName;
        this.stuGender = stuGender;
        this.stuFees = stuFees;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuGender() {
        return stuGender;
    }

    public void setStuGender(String stuGender) {
        this.stuGender = stuGender;
    }

    public double getStuFees() {
        return stuFees;
    }

    public void setStuFees(double stuFees) {
        this.stuFees = stuFees;
    }

    @Override
    public String toString() {
        return "Student{" + "stuId=" + stuId + ", stuName='" + stuName + '\'' +
                ", stuGender='" + stuGender + '\'' + ", stuFees=" + stuFees + '}';
    }

}

public class CountFemalesStudents {
    public static void main(String[] args) {
        List<Student> list = Arrays.asList(
                new Student(101, "vishnu", "male", 25000),
                new Student(102, "prithi", "female", 32000),
                new Student(103, "bhavani", "female", 11000),
                new Student(104, "shubham", "male", 6000),
                new Student(105, "ashwini", "female", 34000),
                new Student(106, "depthi", "female", 2000),
                new Student(107, "avinash", "male", 72000),
                new Student(108, "anusha", "female", 19500));

        System.out.println("The original list is: " + list);
        long femaleStudents = list.stream().filter(stu -> "female".equals(stu.getStuGender())).count();
        System.out.println("The number of females students in a class: " + femaleStudents);
        long maleStudents = list.stream().filter(mal -> "male".equals(mal.getStuGender())).count();
        System.out.println("The list of male students in a class: " + maleStudents);
        System.out.println("If the gender is not inappropriate then we can consider as transgender");

    }
}
