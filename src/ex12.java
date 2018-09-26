import java.util.Scanner;

public class ex12 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        if(a1%4==0  && (a1%100!=0 || a1%400==0)){
            System.out.println("閏年");
        }
        else{
            System.out.println("平年");
        }

    }
}
