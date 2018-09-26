import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        if (v2==1){
            System.out.println((double) (v1-80)*0.7);
        }
        else{
            System.out.println((double) (v1-70)*0.6);
        }

    }
}