package coreJava;

public class break_continue {
    public static void main(String[] args) {
        /*
    Break: To terminate a running loop at any point by a condition.
    Continue: It does not terminate the loop, it just skips the remaining code inside the loop
    body for the current iteration.
         */
        for (int i = 1; i < 11; i++) {
            System.out.print(i+" ");
            if (i == 5) break;
        }
        System.out.println();

        for (int i1 = 0; i1 < 11; i1++) {
            if (i1 % 2 == 0){
                continue;   //skips even numbers
            }
            System.out.print(i1+" ");
        }
    }
}
