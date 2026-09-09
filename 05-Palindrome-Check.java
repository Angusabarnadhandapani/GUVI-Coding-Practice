import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String reverse = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            reverse = reverse + S.charAt(i);
        }
        if (S.equals(reverse)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        sc.close();
    }
}
