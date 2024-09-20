package StreamApis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAverageAge {
    private String name;
    private int age;
    private String gender;

    public FindAverageAge(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "FindAverageAge{" + "name='" + name + '\'' + ", age=" + age +
                ", gender='" + gender + '\'' + '}';
    }
}

class main {
    public static void main(String[] args) {
        List<FindAverageAge> list = new ArrayList<>();
        list.add(new FindAverageAge("vishnu", 24, "male"));
        list.add(new FindAverageAge("shubham", 25, "male"));
        list.add(new FindAverageAge("yogesh", 28, "male"));
        list.add(new FindAverageAge("anusha", 22, "female"));
        list.add(new FindAverageAge("ankita", 30, "female"));
        list.add(new FindAverageAge("roman", 38, "male"));
        list.add(new FindAverageAge("pooja", 36, "female"));

        //calculate average age of male employees...
        double averageMaleAge = list.stream().filter(m -> "male".equals(m.getGender())).mapToInt(m -> m.getAge())
                .average().orElse(Double.NaN);  // it provides default values if values are not provided.

        System.out.println("The average age of all male employees are :  "+averageMaleAge);

        double averageFemaleAge = list.stream().filter(female -> "female".equals(female.getGender()))
                .mapToInt(female -> female.getAge()).average().orElse(Double.NaN);

        System.out.println("The average age of all female employees are :  "+averageFemaleAge);
    }
}
