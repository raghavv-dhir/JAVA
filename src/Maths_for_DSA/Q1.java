package Maths_for_DSA;

public class Q1 {
    public static void main(String[] args) {
        /*
        Q: Given a number n, find out if it is even or odd using bit manipulation.
         */
        int num = 19;
        int LSB = (num & 1);  //right most bit because every other bit is a multiple of 2.
        if (LSB == 1){
            System.out.println("Odd"); //because of 2^0 * 1 = 1 (Odd)
        } else {
            System.out.println("Even"); // 0 * 2^0 = 0 * 1 = 0 (Even)
        }
    }
}
