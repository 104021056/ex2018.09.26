import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        double r = Math.sqrt(x*x+y*y) ;
        if (r>100){
            System.out.println("outside");
        }
        else{
            System.out.println("inside");
        }

    }
}
