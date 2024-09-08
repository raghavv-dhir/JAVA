package coreJava;

public class for_while_doWhile_forEach {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int i1= 1;
        while (i1 < 11){
            System.out.print(i1+" ");
            i1++;
        }
        System.out.println();

        int i2 = 1;
        do {      //atleast one time will execute always even if the condition is false
            System.out.print(i2);
        } while (i2 < 0);
        System.out.println();

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int x : arr){
            System.out.print(x+" ");
        }
    }
}
