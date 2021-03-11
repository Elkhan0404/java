// Просто запустите код и все увидите
import java.util.Scanner;

public class lesson_1_hw {
    public static void main(String[] args) {
        hw();
    }
    private static void hw() {
        System.out.println("Name Hello");
        name();
        System.out.println("---------------------------------------------");
        System.out.println("Year check");
        yearcheck();
        System.out.println("---------------------------------------------");
        System.out.println("Calculator a * (b + (c / d))");
        calcanswer();
        System.out.println("---------------------------------------------");
        System.out.println("Check 10...20");
        checkanswer();
        System.out.println("---------------------------------------------");
        System.out.println("Positive or Negative");
        checkvalueanswer();
        System.out.println("End");
    }
    private static void yearcheck() {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter year:");
        int ye = year.nextInt();
        year(ye);
    }
    private static void name() {
        Scanner username = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = username.nextLine();
        namecheck(name);
    }
    private static void checkvalueanswer() {
        Scanner a1 = new Scanner(System.in);
        System.out.println("Enter a:");
        int an = a1.nextInt();
        checkview(an);
    }
    private static void checkanswer() {
        Scanner a1 = new Scanner(System.in);
        System.out.println("Enter a:");
        int an = a1.nextInt();
        Scanner b1 = new Scanner(System.in);
        System.out.println("Enter b:");
        int bn = b1.nextInt();
        check(an,bn);
    }
    private static void calcanswer() {
        Scanner a1 = new Scanner(System.in);
        System.out.println("Enter a:");
        int an = a1.nextInt();
        Scanner b1 = new Scanner(System.in);
        System.out.println("Enter b:");
        int bn = b1.nextInt();
        Scanner c1 = new Scanner(System.in);
        System.out.println("Enter c:");
        int cn = c1.nextInt();
        Scanner d1 = new Scanner(System.in);
        System.out.println("Enter d:");
        int dn = d1.nextInt();
        float answer = calc( an, bn, cn, dn);
        System.out.println(answer);
    }
    static float calc(int a, int b, int c, int d){
        float first_oper = 1.0f * c/d;
        float second_oper = 1.0f * b + first_oper;
        return 1.0f * a * second_oper;

    }
    static void check(int a, int b){
        if (10 < a && a <= 20 & 10 < b && b <= 20){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    static void checkview(int a){
        if (a >= 0){
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }
    static void namecheck(String name){
        System.out.println("Hello, " + name + "!");
    }
    static void year(int ye){
        if (ye % 100==0 && ye % 400 ==0 ) {
            System.out.println("Высокосный");
        }
        else if (ye % 4 == 0 && ye % 100 > 0) {
            System.out.println("Высокосный");
        }
        else if (ye % 100 == 0) {
            System.out.println("Не высокосный");
        }
        else {
            System.out.println("Не высокосный");
        }
    } //Решение высакосного года взял из инета

}
