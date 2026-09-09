import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit % 2 != 0) {
                if (result.length() > 0) {
                    result.append(" ");
                }
                result.append(digit);
            }
        }
        if (result.length() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(result);
        }
        sc.close();
    }
}