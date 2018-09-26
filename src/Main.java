import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("輸入一攝氏溫度");
        Scanner scn = new Scanner(System.in);
        float C = scn.nextFloat();
        float F = C*9/5+32;
        System.out.println("華氏溫度"+ F);
    }
}