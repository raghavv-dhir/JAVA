package coreJava;

public class if_ifElse_Ladder_Nested_switch {
    public static void main(String[] args) {
        /*
  1. Simple If Statement: Executes a block of code if condition is true, otherwise terminates the block.
  2. If-Else Statement: Executes the IF block when condition is true, otherwise executes ELSE block.
  3. If-Else Ladder: Executes IF block when condition1 is true, then ends, otherwise jumps to ELSE-IF block and executes
  if true and ends, otherwise jumps to next ELSE-IF similarly....If no condition is true, it will execute the ELSE block
   in the end.
  4. Switch statement: Similar to IF-ELSE ladder, only syntax differs.
         */

        int n = 10;
        if (n > 0) {        //SIMPLE IF BLOCK
            System.out.println("Positive number");
        }

        int n1 = -5;
        if (n1 > 0){         //IF-ELSE BLOCK
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative number");
        }

        int n2= 6;
        if (n2 == 1){              //LADDER IF-ELSE
            System.out.println("One");
        } else if (n2 == 2) {
            System.out.println("Two");
        } else if (n2 == 3) {
            System.out.println("Three");
        } else if (n2 == 4) {
            System.out.println("Four");
        } else if (n2 == 5) {
            System.out.println("Five");
        } else {
            System.out.println("Six");
        }

        int n3 = 11;
        if (n3 > 0){               //Nested IF-Else
            if (n3 % 2 == 0){
                System.out.println("Number is Even and greater than 0");
            } else {
                System.out.println("Number is Odd and greater than 0");
            }
        }

        int n4 = 6;
        switch (n4) {          //switch statement
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("Six");
                break;
        }
    }
}
