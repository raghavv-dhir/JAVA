package oops;

public class constructor {
    public static void main(String[] args) {
    student obj = new student(); //Non-Parameterized constructor called
    obj.showFullDetails(); // It will show default values
    student obj2 = new student(2236947,"Raghav","Nabha");  //Parameterized constructor called
    obj2.showFullDetails();
    }
}
/*
Constructor is a special type of method whose name is same as class name.
1. The main purpose of constructor is to initialize the data of the object.
2. Java automatically creates a default constructor when the class does not contain any constructor,
but if the class contains any constructor, then the automatic constructor will not be invoked by java.
3. A constructor is automatically called at the time of object creation.
4. A constructor never contains any return-type including void.

Mainly 2 types: Non-parameterized constructor & Parameterized constructor.
If we create multiple constructors in our class, it is called constructor overloading.
Conditions for const overloading: Number of arguments different, type of argument different, order of
arguments may differ. At least one must be there for constructor overloading.
Same for method overloading.
 */
class student{
    int studentId;
    String studentName;
    String studentCity;
    public student(){
        System.out.println("Non- Param constructor called");
    }
    public student(int i, String n, String c){ //constructor overloading
       studentId=i;
       studentName=n;
       studentCity=c;
    }
    void showFullDetails(){
        System.out.println("ID: "+studentId);
        System.out.println("Name: "+studentName);
        System.out.println("City: "+studentCity);
    }
}
