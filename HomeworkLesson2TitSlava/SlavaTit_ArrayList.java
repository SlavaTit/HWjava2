package HomeworkLesson2TitSlava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*6.Создать массив случайных чисел (размером 15 элементов). Создайте второй массив в два раза больше,
первые 15 элементов должны быть равны элементам первого массива, а остальные элементы заполнить удвоенных значением начальных.
Например
Было → {1,4,7,2}
Стало → {1,4,7,2,2,8,14,4}*/
public class SlavaTit_ArrayList {
    public static void main(String[] args) {
        Arrays(); //List
        Additional(); //Array
    }
    private static void Arrays(){
        int cap = 15;
        int cap2 = cap*2;
        List<Integer> list1 = new ArrayList<>(cap);
        Random rand = new Random();
        for (int i = 0; i < cap; i++){
            list1.add(rand.nextInt(cap)+1);}
        System.out.println("First array: "+list1);
        List<Integer> listCopy = new ArrayList<>(cap2);
        listCopy.addAll(list1);
        for (Integer j: list1) {
            listCopy.add(j*2); }
        System.out.println("Second array: "+listCopy);
    }
    private static void Additional(){
        System.out.println();
        System.out.println("Additional array");
        int[] arrOne = new int [15];
        int[] arrCopy = new int [30];
        Random rand = new Random();
        for (int i = 0; i < arrOne.length; i++){
            arrOne[rand.nextInt(15)]++;
        }
        for (int i = 0; i < arrOne.length; i++){
            arrCopy[i] = arrOne[i];
        }
        for (int j = 0; j<15; j++){
            arrCopy[j+15] = arrOne[j]*2;
        }
        System.out.println("First "+Arrays.toString(arrOne));
        System.out.println("Second "+Arrays.toString(arrCopy));
    }
}
