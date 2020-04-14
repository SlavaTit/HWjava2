package HomeworkLesson2TitSlava;
import java.util.Scanner;
//2. С помощью циклов нарисовать «обои». Причем количество полос должно вводиться с клавиатуры. В примере 7 полос.
//        ***+++***+++***+++***
public class SlavaTit_Wallpaper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s;
        int rows = 5;
        int max = 50;
        do{
            System.out.println("How many stripes do you want? Enter some number ");
            s = scan.nextLine();
            if (isNumber(s)){
                int a = Integer.parseInt(s);
                if ((a > 0) && (a <= max)){
                    for (int i = 0; i < rows; i++ ){
                        int count = 0;
                        for(int j = 0; j<a; j++){
                            if (count%2 == 0){
                                System.out.print("***");
                            }else {
                                System.out.print("+++");
                            } count++;
                        }System.out.println();
                    }
                }else System.out.println("Numbers should be from 1 to "+ max);
            }else System.out.println("Enter digits");
        }while (!isNumber(s));;
    }
    private static boolean isNumber (String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}


