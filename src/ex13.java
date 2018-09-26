import java.util.Scanner;

public class ex13 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a1 = scn.nextInt();

        if(a1<=120){
            System.out.println(a1*2.10f);
            System.out.println(a1*2.10f);
        }
        if(121<=a1&&a1<=330){
            System.out.println(120*2.10f+(a1-120)*3.02f);
            System.out.println(120*2.10f+(a1-120)*2.68f);
        }
        if (331<=a1&&a1<=500) {
            System.out.println(120*2.10f+(330-120)*3.02f+(a1-330)*4.39f);
            System.out.println(120*2.10f+(330-120)*2.68f+(a1-330)*3.61f);
        }
        if(501<=a1&&a1<=700){
            System.out.println(120*2.10f+(330-120)*3.02f+(500-330)*4.39f+(a1-500)*4.97f);
            System.out.println(120*2.10f+(330-120)*2.68f+(500-330)*3.61f+(a1-500)*4.01f);
        }
        if(a1>700){
            System.out.println(120*2.10f+(330-120)*3.02f+(500-330)*4.39f+(700-500)*4.97f+(a1-701)*5.63f);
            System.out.println(120*2.10f+(330-120)*2.68f+(500-330)*3.61f+(700-500)*4.01f+(a1-701)*4.50f);
        }
    }
}
