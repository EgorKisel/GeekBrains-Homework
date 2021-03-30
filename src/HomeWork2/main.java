package HomeWork2;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {

            int[] arr = new int [] {1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1};
            for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 1) {
//                arr[i] = 0
//            } else {
//                arr[i] = 1;
                arr[i] = (arr[i] + 1) % 2;
                System.out.println(arr[i]);
            }

            int [] nums = new int [8];
            for (int i=0, j=0; i<nums.length; i++, j+=3) {
                nums[i]=j;
                System.out.println(nums[i]);
            }

            int [] arr1 = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9,1};
            for (int i=0; i< arr.length; i++){
            if (arr1[i] < 6)
                arr1[i] *= 2;

            System.out.println(arr1[i]);
            }

            int size = 5;
            int [][] arrDiagonal = new int [size][size];
            for (int i=0; i<size; i++) {
                arrDiagonal[i][i] = 1;
                arrDiagonal[i][size-i-1] = 1;
            }
            //System.out.println(Arrays.deepToString(arrDiagonal));
            for (int i = 0; i < size; i++)
            System.out.println(Arrays.toString(arrDiagonal[i]));






    }
}

