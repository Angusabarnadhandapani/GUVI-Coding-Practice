import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = A * 1000;       
        double C = A * 100000;     
        System.out.println((long) B);
        System.out.println((long) C);
    }
}
