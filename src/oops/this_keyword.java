package oops;
public class this_keyword{
    public static void main(String[] args) {
        Student1 obj = new Student1();
        obj.setName("Raghav").setAge(20).displayDetails();
        Student1 obj2 = new Student1();
        obj2.setName("Manav").setAge(24).displayDetails();
    }
}

class Student1 {
    private String name;
    private int age;

    public Student1 setName(String name) {
        this.name = name; // Setting the name of the current object
        return this;      // Returning the current object to allow chaining
    }

    public Student1 setAge(int age) {
        this.age = age;   // Setting the age of the current object
        return this;      // Returning the current object to allow chaining
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

