package coreJava;

public class variables_and_datatypes {
    public static void main(String[] args) {
        /*
        2 Types of datatypes: (Primitive/in-built) & (Non-Primitive/user-defined)
        Primitive: 8 --> int,byte,short,long,float,double,char,String
        Non-primitive: String,Array,List,Class etc.
         */
        int a = 2147483647;          //default value = 0
        System.out.println(a);
        a = 20;                       //we can change values of variables
        System.out.println(a);

        byte y = 127;              //default value = 0
        System.out.println(y);

        short z = 32767;              //default value = 0
        System.out.println(z);

        float b = 3.42f;      //upto 7 decimal digits
        System.out.println(b);   //default value = 0.0

        double c = 3.555667899d;  //upto 16 decimal digits
        System.out.println(c);     //default value = 0.0

        long d = 9223372036854775807L;        //default value = 0
        System.out.println(d);

        String name = "Raghav Dhir";
        System.out.println(name);

        boolean result = false;          //default value = false
        System.out.println(result);

        char x = 'a';              //default value = \u0000
        System.out.println(x);
        char x1 = '9';
        System.out.println(x1);
    }
}