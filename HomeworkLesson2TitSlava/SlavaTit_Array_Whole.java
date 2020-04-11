package HomeworkLesson2TitSlava;
import java.util.Random;
import java.util.Scanner;

/*5.Написать код для возможности создания массива целых чисел
(размер вводиться с клавиатуры) заполнените элементы произвольными числами.
Выведите этот массив на экран.*/
public class SlavaTit_Array_Whole {
    public static void main(String[] args) {

        getArray();

    }
         static int getArray() {
                 Scanner scan = new Scanner(System.in);
                 System.out.println("Enter the length of your array ");
                 if (scan.hasNextInt()) {
                     int b = scan.nextInt();
                     int[] arr = new int[b];
                     Random rand = new Random();
                     for (int i = 0; i < arr.length; i++) {
                         System.out.print("["+ rand.nextInt(arr.length)+"]" + " ");
                         arr[i] += i;
                     }
                     System.out.println();
                 } else {
                     System.out.println("Enter numbers");
                     return getArray();
                 }
             return 0;
         }
}