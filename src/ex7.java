import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int v1 = scn.nextInt();
        int v2 = scn.nextInt();
        int v3 = scn.nextInt();
        int v4 = scn.nextInt();
        int r =v1-(v2*15+v3*20+v4*30);
        if (r<0){
            System.out.println("0");
        }
        else{
            int a = r/50;
            r = r % 50;
            int b = r/5,
                    c = r%5;
            System.out.println(c);
            System.out.println(b);
            System.out.println(a);
        }

    }
}
