import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // char ch = scn.next().charAt(0);
        String str = scn.next();
        int v1 = Integer.parseInt(str,16);
        System.out.println((char)v1);
    }
}