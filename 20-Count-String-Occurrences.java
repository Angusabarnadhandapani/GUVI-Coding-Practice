import java.util.*;
 class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String s = sc.nextLine();
        int count = 0;
        int index = 0;
        while ((index = sentence.indexOf(s, index)) != -1) {
            count++;
            index++;
        }
        if (count == 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
        sc.close();
    }
}