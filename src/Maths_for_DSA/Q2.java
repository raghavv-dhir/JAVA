package Maths_for_DSA;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        /*
        Q: Given an array, every number appears twice except one, find that single number.
         */
        int []arr= {2 ,3 ,4 ,1 ,2 ,1 ,3 ,6 ,4};
        System.out.println(findSingle(arr));
    }

     static int findSingle(int[] arr) {
        int unique = 0;
        for (int num: arr){
            unique ^= num; //XOR of a number with itself is 0, and XOR of a number with 0 is the number itself.
        }
        return unique;
    }
}
