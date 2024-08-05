package oop;

public class Student {
    int age;
    String name;
    String school;

    public Student(int age, String name, String school) {
        this.age = age;
        this.name = name;
        this.school = school;
    }

    private static int addAge(int age) {
        age = age + 1;
        return age;
    }

    public static void main(String[] args) {
        Student sb = new Student(17, "Seongbeom", "BSB");
        System.out.println(sb.age);
        sb.age = addAge(sb.age);
        System.out.println(sb.age);
    }
}
