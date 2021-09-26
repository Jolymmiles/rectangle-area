import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x1, x2, y1, y2, x, y, ans;
        System.out.print("Введите х1:");
        x1 = sc.nextFloat();
        System.out.print("Введите у1:");
        y1 = sc.nextFloat();
        System.out.print("Введите х2:");
        x2 = sc.nextFloat();
        System.out.print("Введите у2:");
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