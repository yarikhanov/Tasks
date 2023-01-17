import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("n:");
        int n = in.nextInt();
        System.out.println("m:");
        int m = in.nextInt();
        int i = 1;
        while (true) {
            System.out.print(i);
            i = 1 + (i + m - 2) %  n;
            if (i == 1)
                break;
        }
    }
}