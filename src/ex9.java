import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();
        int a2 = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int t1 = ((b1*60+b2)-(a1*60+a2))/30;
        int t2 = t1%30;

        if(t2<30){
            System.out.println("0");
        }
        if(t1<4){
            System.out.println(t1*30);
        }
        if (8>t1&&t1>=4) {
            System.out.println(4*30+(t1-4)*40);
        }
        if(t1>=8){
            System.out.println(4*30+4*40+(t1-8)*60);

        }
    }
}
