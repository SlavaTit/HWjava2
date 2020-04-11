package HomeworkLesson2TitSlava;
//Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16).
import java.util.Scanner;

public class SlavaTit_Factorial {
    public static void main(String[] args) {

        factorialCount();

    }
    private static void factorialCount (){
        int factorial = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide digit from 5 to 15 ");
        int k = scan.nextInt();
        if ((4<k)&&(k<16)) {
            for (int i = 1; i <= k; i++) {
                factorial = factorial * i;
            }
            System.out.println("The factorial of the number " + k + " is: " + factorial + ";");
        }else System.out.println("Out of bounds");
    }
}

