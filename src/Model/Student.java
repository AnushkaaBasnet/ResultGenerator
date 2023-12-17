package Model;

public class Student {
    String name;
    int age;
    int marks;
    int grade;

    public Student(String name, int age, int marks, int grade) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.grade = grade;
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

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void information() {
        System.out.println("Name: "+ name  );
        System.out.println("grade: "+grade );
        System.out.println("Age: "+ age );
        System.out.println("Marks:" + marks);
        System.out.println("------------------");

        }
}
