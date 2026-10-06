import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int current = 1;
        int longest = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1]) {
                current++;
            } else {
                current = 1;
            }
            if (current > longest) {
                longest = current;
            }
        }
        if (longest > 1) {
            System.out.println(longest);
        } else {
            System.out.println(-1);
        }
        sc.close();
    }
}