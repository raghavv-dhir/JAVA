package Maths_for_DSA;

public class Q3 {
    public static void main(String[] args) {
        //Q: Find the i'th bit of a number.
        System.out.println(findBit(19,2));
    }
    static int findBit(int num, int i){
        return (num >> i)&1;
    }
}

//Shifting 19 (10011) right by 2 positions gives 100 in binary.
//Performing 100 & 1 gives 0, so the 2nd bit of 19 is 0.
