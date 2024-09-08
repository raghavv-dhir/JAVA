package oops;

public class class_and_objects {
    public static void main(String[] args) {
    Demo obj = new Demo();
    obj.studentId= 2236947;
    obj.studentName="Raghav Dhir";
    obj.studentCity="Nabha";
    obj.showFullDetails();

    System.out.println();

    obj.studentId= 2236955;
    obj.studentName="Rajveer Singh";
    obj.studentCity="Mandi Gobindgarh";
    obj.showFullDetails();
    }
}
/*
A class is like a blueprint or a template for creating objects.
It defines a new data type by grouping together variables
(also known as fields or attributes) and methods (functions or behaviors)
that work on the variables. A class doesn't represent an actual object;
instead, it represents the idea or definition of what an object should be like.
Pre-defined classes: Scanner,Console,System,String.
User-defined classes: Dog,A,Test,Demo.

An object is an instance of a class. When you create an object,
you are creating a specific instance that has its own set of
data (attributes) and can use the methods defined in the class.
 */
class Demo{
    int studentId;
    String studentName;
    String studentCity;
    void study(){
        System.out.println(studentName+" is studying");
    }
    void showFullDetails(){
        System.out.println("My name is "+studentName);
        System.out.println("My student ID is "+studentId);
        System.out.println("I am from "+studentCity);
    }
}