package HomeworkLesson2TitSlava;
import java.util.Scanner;
//1. Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы.
//На одном этаже 4 квартиры. Напишите программу которая получит номер квартиры с клавиатуры,
//и выведет на экран на каком этаже, какого подъезда расположенна эта квартира. Если
//такой квартиры нет в этом доме то нужно сообщить об этом пользователю.

public class SlavaTit_Apartments {
    public static void main(String[] args) {
        int apartments = 4 * 9 * 4; // 144 apartments
        String a;
        int b = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Enter apartment number ");
            a = scan.nextLine();
            if (isNumber(a)) {
                b = Integer.parseInt(a);
                if (isPositive(b)){
                    if (b<=apartments){
                        PorchFlat(b);
                     } else System.out.println("No such flat");
                }
            } else {
                System.out.println("Only DIGITS accepted");
                System.out.println();
            }
        }while (!isNumber(a));
    }
    private static int PorchFlat (int m) {
        int count = 0;
        if (m <=36){ for (int i = 1; i <= m; i+=4) count++;
            System.out.println("Apartment " + m + ", " + "floor " + count + ", " + "porch 1");
        } else if ((m > 36) && (m <= 72)) {
            for (int i = 37; i <= m; i += 4) count++;
            System.out.println("Apartment " + m + ", " + "floor " + count + ", " + "porch 2");
        }else if ((m > 72) && (m <= 108)) {
            for (int i = 73; i <= m; i += 4) count++;
            System.out.println("Apartment " + m + ", " + "floor " + count + ", " + "porch 3");
        }else if ((m > 108) && (m <= 144)) {
            for (int i = 109; i <= m; i += 4) count++;
            System.out.println("Apartment " + m + ", " + "floor " + count + ", " + "porch 4");
        }
        return m;
    }
    private static boolean isNumber (String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean isPositive (int k){
        if (k > 0) {
            return true;
        }else System.out.println("Wrong number. Enter numbers greater than 0.");
        return false;
    }

}
