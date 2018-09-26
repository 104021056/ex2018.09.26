import java.util.Scanner;

public class ex10 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t1 = scn.nextInt();

        if(3<=t1&&t1<=5){
            System.out.println("Spring");
        }
        else if(6<=t1&&t1<=8){
            System.out.println("Summer");
        }
        else if (11>=t1&&t1>=9) {
            System.out.println("Autumn");
        }
        else{
            System.out.println("Winter");

        }
    }
}


