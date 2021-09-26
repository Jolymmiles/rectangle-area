import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1, x2, y1, y2, x, y, ans;
        x1 = sc.nextFloat();
        y1 = sc.nextFloat();
        x2 = sc.nextFloat();
        y2 = sc.nextFloat();
        x = x2 - x1;
        y = y2 - y1;
        ans = x * y;
        if ( ans < 0) { System.out.println(-1 * ans);
        } else {
            System.out.println(ans);
        }

    }
}