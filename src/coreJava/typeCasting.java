package coreJava;

public class typeCasting {
    public static void main(String[] args) {
        /*
        Automatically by JVM- >Implicit Type Casting
        Forcefully by Programmer->Explicit type Casting
         */
        int value = 56;            //Implicitly converted by JVM.
        double value1 = value;    //It will happen when there will be no data loss from one conversion to another.
        System.out.println(value1);  //Ex: int->double: 56->56.0

        double myValue = 56.8;          //Explicitly converted by user
        int myValue1 = (int) myValue;  //We will have to explicitly convert when there will be a data loss from one conversion to another.
        System.out.println(myValue1);  //Ex: double->int: 56.8->56
    }
}
