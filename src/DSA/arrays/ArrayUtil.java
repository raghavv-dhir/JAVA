package DSA.arrays;

import java.util.Arrays;

public class ArrayUtil {

    public static void printArray(int[] arr){ // function to print array elements
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void arrayDemo(){   // array initialization, declaration, adding/updating elements, accessing them.
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 1;
        myArray[2] = 2;
        myArray[3] = 8;
        myArray[4] = 10;
        myArray[2] = 12;
        System.out.println("Length of array: "+myArray.length);
        printArray(myArray);
    }

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void moveZerosToEnd(int[] arr){
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
    }

    public int[] resizeArray(int[] arr, int capacity){
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }

    public int findMissingNumber(int[] arr){
        int n = arr.length + 1;
        int totalSum = n * (n + 1) / 2;
        int currentSum =0;
        for (int i = 0; i < arr.length; i++) {
            currentSum+= arr[i];
        }
        return totalSum - currentSum;
    }

    public static int findSecondMax(int[] arr){
        if (arr.length < 2){
            return -1;
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static int[] removeEven(int arr[]){
        int oddCount=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int idx =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                result[idx] = arr[i];
                idx++;
            }
        }
        return result;
    }

    public static void reverseArray(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        ArrayUtil obj = new ArrayUtil();
        int[] arr = {2,4,1,8,6,3,5};
        System.out.println(obj.findMissingNumber(arr));
    }
}
