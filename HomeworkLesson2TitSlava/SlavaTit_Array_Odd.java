package HomeworkLesson2TitSlava;

import java.util.Arrays;
import java.util.Random;

//4.Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем.
public class SlavaTit_Array_Odd {
    public static void main(String[] args) {
        int[] arr = {0, 5, 2, 4, 7, 1, 3, 19};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 1) count++;
        }
        System.out.println("The number of odd digits in the array: " + count);
        System.out.println();
        System.out.println("Additional training: ");
        Additional();
    }
    //Additional
    static void Additional(){
        Random r = new Random();
        int[] arr = new int[10];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            arr[i] = r.nextInt(arr.length);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 == 1) count++;
        }

        System.out.println("Second array: "+Arrays.toString(arr));
        System.out.println("The number of odd digits in the array: " + count);
    }
}
