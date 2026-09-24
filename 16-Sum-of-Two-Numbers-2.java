import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = A + B;
        if (C == (int) C) {
            System.out.println((int) C);
        } else {
            System.out.printf("%.1f", C);
        }
    }
}