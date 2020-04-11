package HomeworkLesson2TitSlava;
/*7.Введите строку текста с клавиатуры — реализуйте программу для
возможности подсчета количества символа — 'b' в этой строке, с выводом результат на экран.*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SlavaTit_Count {
    public static void main(String[] args) {

        textScan();
    }
    private static void textScan(){
        int count = 0;
        List<Character> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text: ");
        String s = scan.nextLine();
        for (char c : s.toCharArray()){
            list.add(c);
            }
        for (char m: list){
            if (m == 'b') count++;
            else continue;
        }
        System.out.println("The number of letters 'b' in the entered text: "+count+";");
        System.out.println();

        //ADDITIONAL SECTION
        int countAdditional = 0;
        for (char m: list){
            if (m == 'B') countAdditional++;
            else continue;
        }
        if (countAdditional!=0) {
            System.out.println("Additional Section;");
            System.out.println("The number of letters 'B' in the entered text: " + countAdditional + ";");
        }
        }
    }

