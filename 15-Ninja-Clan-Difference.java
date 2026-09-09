import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long kabali = sc.nextLong();
            long opponent = sc.nextLong();

            System.out.println(Math.abs(opponent - kabali));
        }
        sc.close();
    }
}
