import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        StringBuilder sb = new StringBuilder(s);
        if (len % 2 == 0) {
            int mid2 = len / 2;
            int mid1 = mid2 - 1;
            sb.setCharAt(mid1, '*');
            sb.setCharAt(mid2, '*');
        } else {
            int mid = len / 2;
            sb.setCharAt(mid, '*');
        }
        System.out.println(sb.toString());
    }
}
